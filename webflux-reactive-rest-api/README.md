## Spring Boot 2

### Spring Webflux Reactive Example

This is a very basic example of a Reactive WebFlux endpoint listening on port 8090 (configured in resources/application.properties)

Includes 2 very simple GET endpoints and WebClient for testing

`` $ ./mvwn spring-boot:run  ``

### Usage

`` $ curl http://localhost/hello-world ``

`` $ curl http://localhost/hello-world/john ``

### Notes

Shows how to access the Spring `` Environment `` and also uses Logback.
