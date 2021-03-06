/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.view.livros;

import com.systembook.booksystem.controllers.AutorController;
import com.systembook.booksystem.controllers.EditoraController;
import com.systembook.booksystem.controllers.LivroController;
import com.systembook.booksystem.model.entities.Autor;
import com.systembook.booksystem.model.entities.Editora;
import com.systembook.booksystem.model.entities.Livro;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author jpereira
 */
@Component
public class IncluirEditarLivros extends javax.swing.JDialog {

    private ConsultarLivros consulta;
    private Livro entity;

    @Autowired
    private EditoraController controllerEditora;

    @Autowired
    private LivroController controller;

    @Autowired
    private AutorController controllerAutor;

    /**
     * Creates new form IncluirEditarAutor
     */
    public IncluirEditarLivros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public IncluirEditarLivros() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        txt_preco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        cb_autor = new javax.swing.JComboBox<>();
        cb_editora = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Incluir / Editar Livro");

        jLabel2.setText("Preco");

        jLabel3.setText("Titulo");

        btn_save.setText("Salvar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_cancel.setText("Cancelar");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel4.setText("Editora");

        jLabel5.setText("Autor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_save)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 499, Short.MAX_VALUE)
                                .addComponent(btn_cancel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(txt_preco))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_autor, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_editora, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_editora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    public void setEntityToText(Livro entity) {
        this.entity = entity;
        this.txt_titulo.setText(this.entity.getTitulo());
        if (this.entity.getPreco() != null) {
            this.txt_preco.setText(this.entity.getPreco().toString());
        } else {
            this.txt_preco.setText("0");
        }
        this.cb_autor.setSelectedItem(entity.getAutor());
        this.cb_editora.setSelectedItem(entity.getEditora());
    }

    public Livro getTextToEntity() {
        if (this.entity == null) {
            this.entity = new Livro();
        }

        this.entity.setTitulo(txt_titulo.getText());
        this.entity.setPreco(new BigDecimal(txt_preco.getText()));
        this.entity.setAutor((Autor) cb_autor.getSelectedItem());
        this.entity.setEditora((Editora) cb_editora.getSelectedItem());
        return this.entity;
    }

    private void loadComboAutor() {
        cb_autor.removeAllItems();
        List<Autor> autores = this.controllerAutor.listarByNome(null);
        for (Autor c : autores) {
            cb_autor.addItem(c);
        }
    }

    private void loadComboEditora() {
        cb_editora.removeAllItems();
        List<Editora> entities = this.controllerEditora.listarByNome(null);
        for (Editora c : entities) {
            cb_editora.addItem(c);
        }
    }

    public void initialize(Livro entity, ConsultarLivros consulta) {
        this.loadComboAutor();
        this.loadComboEditora();
        this.consulta = consulta;
        this.setEntityToText(entity);
        this.setVisible(true);
        setLocationRelativeTo(null);

    }

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        this.controller.save(getTextToEntity());
        this.setEntityToText(new Livro());
        consulta.search();
    }//GEN-LAST:event_btn_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<Autor> cb_autor;
    private javax.swing.JComboBox<Editora> cb_editora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_preco;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
