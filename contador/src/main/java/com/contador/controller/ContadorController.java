package com.contador.controller;

import com.contador.model.Contador;
import com.contador.service.ContadorService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Controller("/contador")
@RequiredArgsConstructor
public class ContadorController {

    private final ContadorService service;

    @Get
    List<Contador> listaContador() {
        return service.listaContador();
    }
}
