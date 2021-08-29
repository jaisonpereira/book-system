/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.service;

import com.systembook.booksystem.execeptions.BusinessException;
import com.systembook.booksystem.model.entities.Autor;
import com.systembook.booksystem.repositories.AutorRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author jpereira
 */
@Service
public class AutorService {

    private AutorRepository repository;

    public AutorService(AutorRepository repository) {
        this.repository = repository;
    }

    public List<Autor> listarByNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            return this.repository.findByNomeContains(nome);
        }
        return (List<Autor>) this.repository.findAll();
    }

    public Autor save(Autor entity) throws BusinessException {

        if (entity.getNome() == null || entity.getNome().isEmpty()) {
            throw new BusinessException("Nome do autor é obrigatório");
        }

        if (entity.getNomeCompleto() == null || entity.getNomeCompleto().isEmpty()) {
            throw new BusinessException("Nome Completo do autor é obrigatório");
        }

        return this.repository.save(entity);
    }

    public void excluir(Autor entity) {
        this.repository.deleteById(entity.getId());
    }

}
