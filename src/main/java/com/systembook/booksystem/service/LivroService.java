/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.service;

import com.systembook.booksystem.execeptions.BusinessException;
import com.systembook.booksystem.model.entities.Livro;
import com.systembook.booksystem.repositories.AutorRepository;
import com.systembook.booksystem.repositories.EditoraRepository;
import com.systembook.booksystem.repositories.LivroRepository;
import java.sql.SQLException;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jpereira
 */
@Service
public class LivroService {

    private LivroRepository repository;
    private AutorRepository repositoryAutor;
    private EditoraRepository repositoryEditora;

    public LivroService(LivroRepository repository, AutorRepository repositoryAutor, EditoraRepository repositoryEditora) {
        this.repository = repository;
        this.repositoryAutor = repositoryAutor;
        this.repositoryEditora = repositoryEditora;
    }

    public List<Livro> listarByTitulo(String titulo) {
        if (titulo != null && !titulo.isEmpty()) {
            return this.repository.findByTituloContains(titulo);
        }
        return (List<Livro>) this.repository.findAll();
    }

    @Transactional(rollbackFor = {SQLException.class})
    public void save(Livro entity) throws BusinessException {

        if (entity.getTitulo() == null || entity.getTitulo().isEmpty()) {
            throw new BusinessException("Titulo do Livro é obrigatório");
        }

        if (entity.getPreco() == null) {
            throw new BusinessException("Preço é obrigatorio");
        }

        if (entity.getAutor() == null) {
            throw new BusinessException("Autor do livro é obrigatorio");
        } else {
            entity.setAutor(this.repositoryAutor.findById(entity.getAutor().getId()).get());
        }

        if (entity.getEditora() == null) {
            throw new BusinessException("Editora do livro é obrigatorio");
        } else {
            entity.setEditora(this.repositoryEditora.findById(entity.getEditora().getId()).get());
        }

        this.repository.save(entity);
    }

    public void excluir(Livro entity) {
        this.repository.deleteById(entity.getId());
    }

}
