/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.systembook.booksystem.config;

import com.systembook.booksystem.execeptions.BusinessException;
import com.systembook.booksystem.model.entities.Autor;
import com.systembook.booksystem.model.entities.Editora;
import com.systembook.booksystem.model.entities.Livro;
import com.systembook.booksystem.service.AutorService;
import com.systembook.booksystem.service.EditoraService;
import com.systembook.booksystem.service.LivroService;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jpereira
 */
@Configuration
public class CarregaDadosIniciais implements CommandLineRunner {

    private LivroService serviceLivro;
    private EditoraService serviceEditora;
    private AutorService serviceAutor;

    private Autor autor1;
    private Autor autor2;
    private Editora editora1;
    private Editora editora2;

    public CarregaDadosIniciais(LivroService serviceLivro, EditoraService serviceEditora, AutorService serviceAutor) {
        this.serviceLivro = serviceLivro;
        this.serviceEditora = serviceEditora;
        this.serviceAutor = serviceAutor;
    }

    private void createAutores() throws BusinessException {
        List<Autor> list = serviceAutor.listarByNome(null);
        if (list == null || list
                .isEmpty()) {
            this.autor1 = this.serviceAutor.save(new Autor("Henrique", "Henrique de Castro"));
            this.autor2 = this.serviceAutor.save(new Autor("Roberto", "Roberto de Siqueira"));
            System.out.println("Autores Criados.......");
        }
    }

    private void createEditoras() throws BusinessException {
        List<Editora> list = serviceEditora.listarByNome(null);
        if (list == null || list
                .isEmpty()) {
            this.editora1 = this.serviceEditora.save(new Editora("Milenum", "www.milenum.com"));
            this.editora2 = this.serviceEditora.save(new Editora("Sacura", "www.sacura.com"));
            System.out.println("Editoras Criadas.......");
        }
    }

    private void createLivros() throws BusinessException {
        List<Livro> list = serviceLivro.listarByTitulo(null);
        if (list == null || list
                .isEmpty()) {
            Livro livro = new Livro();
            livro.setAutor(autor1);
            livro.setEditora(editora1);
            livro.setPreco(new BigDecimal("3.0"));
            livro.setTitulo("A volta dos que nao foram");
            this.serviceLivro.save(livro);

            Livro livro2 = new Livro();
            livro2.setAutor(autor2);
            livro2.setEditora(editora2);
            livro2.setPreco(new BigDecimal("4.0"));
            livro2.setTitulo("Poeira em auto mar");
            this.serviceLivro.save(livro2);

            System.out.println("Editoras Criadas.......");
        }
    }

    @Override
    @Transactional(rollbackFor = {SQLException.class})
    public void run(String... args) throws Exception {
        System.out.println("Carregando dados iniciais");
        this.createEditoras();
        this.createAutores();
        this.createLivros();
    }

}
