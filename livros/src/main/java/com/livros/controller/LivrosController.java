package com.livros.controller;

import com.livros.model.Livros;
import com.livros.service.LivrosService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Controller("/livros")
@RequiredArgsConstructor
public class LivrosController {

    private final LivrosService service;

    @Get
    List<Livros> listAll() {
        return service.listAll();
    }

    @Get("/{codigo}")
    Optional<Livros> encontrarLivro(String codigo) {
        return service.findByCodigo(codigo);
    }
}
