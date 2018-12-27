package springboot2.reactive;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class HelloWorldHandler {
    private static final Logger logger = LoggerFactory.getLogger("springboot2.reactive");

    public Mono<ServerResponse> helloworld(ServerRequest request) {
        logger.trace("helloworld called");

        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello World!"));
    }

    public Mono<ServerResponse> helloworldWithName(ServerRequest request) {
        String message = String.format("Hello, %s !", request.pathVariable("name"));

        logger.trace("helloworld called with name:" + message);

        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject(message));
    }
}
