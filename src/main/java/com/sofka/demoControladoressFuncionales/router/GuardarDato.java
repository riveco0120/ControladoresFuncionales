package com.sofka.demoControladoressFuncionales.router;

import com.sofka.demoControladoressFuncionales.dto.DatoDTO;
import reactor.core.publisher.Mono;

public interface GuardarDato {
    public Mono<String> apply(DatoDTO datoDTO);
}
