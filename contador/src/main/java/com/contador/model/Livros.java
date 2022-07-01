package com.contador.model;

import io.micronaut.core.annotation.Creator;
import io.micronaut.core.annotation.Introspected;

import java.util.Objects;


@Introspected
public class Livros {

    private String codigo;
    private String nome;
    private String autor;

    @Creator
    public Livros(String codigo, String nome, String autor) {
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livros livros = (Livros) o;
        return Objects.equals(codigo, livros.codigo) && Objects.equals(nome, livros.nome) && Objects.equals(autor, livros.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, autor);
    }
}
