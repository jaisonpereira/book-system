/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.service;

import com.systembook.booksystem.execeptions.BusinessException;
import com.systembook.booksystem.model.entities.Editora;
import com.systembook.booksystem.repositories.EditoraRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author jpereira
 */
@Service
public class EditoraService {

    private EditoraRepository repository;

    public EditoraService(EditoraRepository repository) {
        this.repository = repository;
    }

    public List<Editora> listarByNome(String nome) {
        if (nome != null && nome.isEmpty()) {
            return this.repository.findByNomeContains(nome);
        }

        return (List<Editora>) this.repository.findAll();
    }

    public Editora save(Editora entity) throws BusinessException {

        if (entity.getNome() == null || entity.getNome().isEmpty()) {
            throw new BusinessException("Nome da Editora é obrigatório");
        }

        if (entity.getUrl() == null || entity.getUrl().isEmpty()) {
            throw new BusinessException("Url da editora é obrigatória");
        }

        return this.repository.save(entity);
    }

    public void excluir(Editora entity) {
        this.repository.deleteById(entity.getId());
    }

}
