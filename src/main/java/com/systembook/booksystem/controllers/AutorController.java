/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.controllers;

import com.systembook.booksystem.execeptions.BusinessException;
import com.systembook.booksystem.model.entities.Autor;
import com.systembook.booksystem.service.AutorService;
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
public class AutorController {

    private AutorService service;

    public AutorController(AutorService service) {
        this.service = service;
    }

    public List<Autor> listarByNome(String nome) {
        return this.service.listarByNome(nome);
    }

    public void excluir(Autor autor) {
        this.service.excluir(autor);
    }

    public void save(Autor entity) {
        try {
            this.service.save(entity);
            JOptionPane.showMessageDialog(null, "Autor Salvo com sucesso");
        } catch (BusinessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Validação", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro interno", "Error", 0);
            Logger.getLogger(AutorController.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
