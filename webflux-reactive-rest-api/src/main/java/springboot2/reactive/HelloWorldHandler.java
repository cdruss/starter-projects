package springboot2.reactive;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloWorldHandler {
    public Mono<ServerResponse> helloworld(ServerRequest request) {
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello World!"));
    }

    public Mono<ServerResponse> helloworldWithName(ServerRequest request) {
        String message = String.format("Hello, %s !", request.pathVariable("name"));

        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject(message));
    }
}
