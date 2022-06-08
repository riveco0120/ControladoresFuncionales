package com.sofka.demoControladoressFuncionales.service.implement;

import com.sofka.demoControladoressFuncionales.collections.Dato;
import com.sofka.demoControladoressFuncionales.repository.IDatoRepository;
import com.sofka.demoControladoressFuncionales.service.IDatoService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class DatoService implements IDatoService {
    @Autowired
    IDatoRepository repositorio;

    @Override
    public Mono<Dato> crear(Dato dato) {
        return repositorio.save(dato);
    }

    @Override
    public Flux<Dato> buscarTodos() {
        return repositorio.findAll();
    }
}
