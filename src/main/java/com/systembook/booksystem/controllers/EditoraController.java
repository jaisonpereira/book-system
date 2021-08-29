/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.controllers;

import com.systembook.booksystem.execeptions.BusinessException;
import com.systembook.booksystem.model.entities.Editora;
import com.systembook.booksystem.service.EditoraService;
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
public class EditoraController {

    private EditoraService service;

    public EditoraController(EditoraService service) {
        this.service = service;
    }

    public List<Editora> listarByNome(String nome) {
        return this.service.listarByNome(nome);
    }

    public void excluir(Editora entity) {
        this.service.excluir(entity);
    }

    public void save(Editora entity) {
        try {
            this.service.save(entity);
            JOptionPane.showMessageDialog(null, "Editora Salvo com sucesso");
        } catch (BusinessException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Validação", 0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro interno", "Error", 0);
            Logger.getLogger(EditoraController.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
