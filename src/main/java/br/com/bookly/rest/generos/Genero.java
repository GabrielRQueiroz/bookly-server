package br.com.bookly.rest.generos;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;

@Entity
public class Genero extends PanacheEntity {
    public String nome;

    public String corHexadecimal;
}
