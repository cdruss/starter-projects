## Spring Boot 2

### Spring Webflux Reactive Example

This is a very basic example of a Reactive WebFlux endpoint listening on port 8090 (configured in resources/application.properties)

Includes 2 GET endpoints and WebClient for testing

`` $ ./mvwn spring-boot:run  ``

### Usage

`` $ curl http://localhost/hello-world ``

`` $ curl http://localhost/hello-world/john ``

### Notes

Shows how to access the Spring `` Environment `` and also uses Logback.


### Docker
A sample Dockerfile is included to build the app, its dependencies and the runtime into a single container. The resulting container image can be run anywhere without needing to configure an environment specific to the application, its dependencies, or the Java runtime.
 
##### Build and tag docker image

`` docker build -t {dockerhub_username}/webflux-reactive-rest-api:0.1.0 --build-arg JAR_FILE=target/webflux-reactive-rest-api-0.0.1-SNAPSHOT.jar . ``

##### List local images

`` docker images ``

##### Run docker image

`` docker run -d -p 8090:8090 {dockerhub_username}/webflux-reactive-rest-api:0.1.0 ``

##### Tail logs on running container

`` docker ps ``

`` docker logs -f {container_id} ``


##### Stop running container
 
`` docker ps ``

`` docker stop {container_id} ``

##### Push image to dockerhub registry

`` docker push {dockerhub_username}/webflux-reactive-rest-api:0.1.0 ``

##### Delete image

`` docker images ``

`` docker rmi {image_id} --force ``

### Kubernetes

`` kubectl create -f kubernetes/webflux-app.yml ``

`` kubectl port-forward webflux-app-65754bdf9-ng2kj 8079:8090 ``






