/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.repositories;

import com.systembook.booksystem.model.entities.Livro;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jpereira
 */
@Repository
public interface LivroRepository extends CrudRepository<Livro, Long> {

    public List<Livro> findByTituloContains(String titulo);

}
