package com.sofka.demoControladoressFuncionales.router;

import com.sofka.demoControladoressFuncionales.dto.DatoDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class ConsultaDatoRouter {

    @Bean
    public RouterFunction<ServerResponse> getAll(UseCaseListar useCaseListar) {
        return route(
                GET("/consultar").and(accept(MediaType.APPLICATION_JSON)),
                request -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(BodyInserters.fromPublisher(useCaseListar.get(), DatoDTO.class))
        );
    }

}
