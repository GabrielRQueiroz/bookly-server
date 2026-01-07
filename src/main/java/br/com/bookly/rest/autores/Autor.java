package br.com.bookly.rest.autores;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Autor extends PanacheEntity {
    public String nomeComum;

    @Column(nullable = false)
    public String nomeCompleto;

    @Column(nullable = false)
    public String nacionalidade;
}
