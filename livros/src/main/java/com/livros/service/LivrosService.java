package com.livros.service;

import com.livros.model.Livros;
import jakarta.inject.Singleton;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Singleton
public class LivrosService {

    private final List<Livros> livraria = new ArrayList<>();

    @PostConstruct
    void init() {
        livraria.add(new Livros("01","Codigo Limpo","Robert C. Martin"));
        livraria.add(new Livros("02","Arquitetura Limpa","Robert C. Martin"));
        livraria.add(new Livros("03","Java: como programar","Paul Deitel"));
        livraria.add(new Livros("04","O programador Apaixonado","Chad Fowler"));
    }

    public List<Livros>listAll(){
        return livraria;
    }

    public Optional<Livros> findByCodigo(String codigo){
        return livraria.stream()
                .filter(b -> b.getCodigo().equals(codigo))
                .findFirst();
    }
}
