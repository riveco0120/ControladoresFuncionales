package com.sofka.demoControladoressFuncionales.service;

import com.sofka.demoControladoressFuncionales.collections.Dato;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IDatoService {
    public Mono<Dato> crear(Dato dato);
    public Flux<Dato> buscarTodos();

}
