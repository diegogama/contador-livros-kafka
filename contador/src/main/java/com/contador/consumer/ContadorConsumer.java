package com.contador.consumer;

import com.contador.model.Livros;
import com.contador.service.ContadorService;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.Topic;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@KafkaListener
@RequiredArgsConstructor
public class ContadorConsumer {

    private final ContadorService service;

    @Topic("contador")
    public void atualizarContador(Livros livro) {
        log.info(livro.toString());
        service.atualizarContador(livro);
    }
}
