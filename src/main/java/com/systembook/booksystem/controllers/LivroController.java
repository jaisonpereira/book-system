/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.controllers;

import com.systembook.booksystem.execeptions.BusinessException;
import com.systembook.booksystem.model.entities.Autor;
import com.systembook.booksystem.model.entities.Livro;
import com.systembook.booksystem.service.LivroService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.springframework.stereotype.Controller;

/**
 *
 * @author jpereira
 */
@Controller
public class LivroController {

    private LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    public List<Livro> listarByNome(String nome) {
        return this.service.listarByTitulo(nome);
    }

    public void excluir(Livro entity) {
        this.service.excluir(entity);
    }

    public void save(Livro entity) {
        try {
            this.service.save(entity);
            JOptionPane.showMessageDialog(null, "Livro Salvo com sucesso");
        } catch (BusinessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Validação", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro interno", "Error", 0);
            Logger.getLogger(LivroController.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
