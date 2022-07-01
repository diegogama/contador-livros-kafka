package com.livros.producer;

import com.livros.model.Livros;
import io.micronaut.configuration.kafka.annotation.KafkaClient;
import io.micronaut.configuration.kafka.annotation.Topic;
import reactor.core.publisher.Mono;

@KafkaClient
public interface ContadorClient {

    @Topic("contador")
    Mono<Livros> updateAtualizarContador(Livros livros);
}
