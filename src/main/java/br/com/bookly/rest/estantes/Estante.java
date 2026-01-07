package br.com.bookly.rest.estantes;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;

@Entity
public class Estante extends PanacheEntity {
    public String nome;
}
