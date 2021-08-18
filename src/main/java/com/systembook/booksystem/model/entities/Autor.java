/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.model.entities;

/**
 *
 * @author jpereira
 */
public class Autor {

    public Autor(String nome, String nomeCompleto) {
        this.nome = nome;
        this.nomeCompleto = nomeCompleto;
    }

    public Autor() {
    }

    private String nome;
    private String nomeCompleto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

}
