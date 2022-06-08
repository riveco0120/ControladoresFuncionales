package com.sofka.demoControladoressFuncionales.router;

import com.sofka.demoControladoressFuncionales.dto.DatoDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CrearDatoRouter {

    @Bean
    public RouterFunction<ServerResponse>createquestion(UseCaseCrear useCaseCrear){
        return route(POST("/crear").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(DatoDTO.class)
                        .flatMap(questioDTO->useCaseCrear.apply(questioDTO))
                        .flatMap((result->ServerResponse.ok()
                                .contentType(MediaType.TEXT_PLAIN)
                                .bodyValue(result))
                        )
        );

    }
}
