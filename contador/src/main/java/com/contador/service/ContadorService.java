package com.contador.service;

import com.contador.model.Contador;
import com.contador.model.Livros;
import jakarta.inject.Singleton;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

@Singleton
public class ContadorService {

    private final Map<Livros, Long> contador = new ConcurrentHashMap<>();

    public void atualizarContador(Livros livro){
        contador.compute(livro, (k, v) -> {
            return v == null ? 1L : v + 1;
        });
    }

    public List<Contador> listaContador() {
        return contador
                .entrySet()
                .stream()
                .map(e -> new Contador(e.getKey().getCodigo(),e.getValue()))
                .collect(Collectors.toList());
    }
}
