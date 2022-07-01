package com.livros.producer;

import com.livros.model.Livros;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MutableHttpResponse;
import io.micronaut.http.annotation.Filter;
import io.micronaut.http.filter.HttpServerFilter;
import io.micronaut.http.filter.ServerFilterChain;
import lombok.RequiredArgsConstructor;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;

@Filter("/livros/?*")
@RequiredArgsConstructor
public class ContadorFiltro implements HttpServerFilter {

    private final ContadorClient contadorClient;


    @Override
    public Publisher<MutableHttpResponse<?>> doFilter(HttpRequest<?> request,
                                                      ServerFilterChain chain) {
        return Flux
                .from(chain.proceed(request))
                .flatMap(response -> {
                    Livros livros = response.getBody(Livros.class).orElse(null);
                    if (livros == null) {
                        return Flux.just(response);
                    }
                    return Flux.from(contadorClient.updateAtualizarContador(livros)).map(b -> response);
                });
    }
}
