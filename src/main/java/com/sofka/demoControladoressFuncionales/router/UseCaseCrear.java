package com.sofka.demoControladoressFuncionales.router;

import com.sofka.demoControladoressFuncionales.collections.Dato;
import com.sofka.demoControladoressFuncionales.dto.DatoDTO;
import com.sofka.demoControladoressFuncionales.mapper.MapperUtils;
import com.sofka.demoControladoressFuncionales.repository.IDatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Mono;

@Service
@Validated
public class UseCaseCrear implements GuardarDato {

    private final IDatoRepository iDatoRepository;
    private final MapperUtils mapperUtils;

    @Autowired
    public UseCaseCrear(MapperUtils mapperUtils,IDatoRepository datoRepository){
        this.iDatoRepository =datoRepository;
        this.mapperUtils =mapperUtils;
    }
    @Override
    public Mono<String> apply(DatoDTO datoDTO) {
        return iDatoRepository.save(mapperUtils.mapperToDato(null).apply(datoDTO)).map(Dato::getId);
    }


}
