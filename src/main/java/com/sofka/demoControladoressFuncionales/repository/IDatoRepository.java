package com.sofka.demoControladoressFuncionales.repository;

import com.sofka.demoControladoressFuncionales.collections.Dato;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface IDatoRepository extends ReactiveMongoRepository<Dato,String> {
}
