package br.com.bookly.rest.nichos;

import br.com.bookly.rest.estantes.Estante;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Nicho extends PanacheEntity {
    public Integer fileira;

    public Integer coluna;

    public @ManyToOne Estante estante;
}
