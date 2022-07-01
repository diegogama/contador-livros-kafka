package com.contador.model;

import io.micronaut.core.annotation.Creator;
import io.micronaut.core.annotation.Introspected;


@Introspected
public class Contador {

    private String codigoLivro;
    private Long contagem;


    @Creator
    public Contador(String codigoLivro, Long contagem) {
        this.codigoLivro = codigoLivro;
        this.contagem = contagem;
    }

    public String getCodigoLivro() {
        return codigoLivro;
    }

    public Long getContagem() {
        return contagem;
    }
}


