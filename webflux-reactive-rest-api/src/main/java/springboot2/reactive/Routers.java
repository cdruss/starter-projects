package springboot2.reactive;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Routers {
    @Bean
    public RouterFunction<ServerResponse> route(HelloWorldHandler handler) {
        return RouterFunctions
                .route(RequestPredicates.GET("/hello-world").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)), handler::helloworld)
                .andRoute(RequestPredicates.GET("/hello-world/{name}").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
        handler::helloworldWithName);
    }
}
