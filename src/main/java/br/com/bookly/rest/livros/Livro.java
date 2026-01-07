package br.com.bookly.rest.livros;

import br.com.bookly.rest.autores.Autor;
import br.com.bookly.rest.generos.Genero;
import br.com.bookly.rest.nichos.Nicho;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Livro extends PanacheEntity {

    public String titulo;

    public String editora;

    public @ManyToOne Autor autor;

    @Column(nullable = false)
    public Integer anoPublicacao;

    @Column(nullable = false)
    public Byte[] capa;

    @Column(nullable = false)
    public @ManyToOne Genero genero;

    @Column(nullable = false)
    public @ManyToOne Nicho nicho;

    @Column(nullable = false)
    public @ManyToOne Livro livroRelacionado;
}
