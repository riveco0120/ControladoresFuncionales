package com.sofka.demoControladoressFuncionales.router;

import com.sofka.demoControladoressFuncionales.dto.DatoDTO;
import com.sofka.demoControladoressFuncionales.mapper.MapperUtils;
import com.sofka.demoControladoressFuncionales.repository.IDatoRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;

@Service
@Validated
public class UseCaseListar implements Supplier<Flux<DatoDTO>> {
    private final IDatoRepository repositorio;
    private final MapperUtils mapperUtils;
    public UseCaseListar(MapperUtils mapperUtils, IDatoRepository repositorio) {
        this.repositorio = repositorio;
        this.mapperUtils = mapperUtils;
    }

    @Override
    public Flux<DatoDTO> get() {
        return repositorio.findAll().map(mapperUtils.mapDatoToDTO());
    }
}
