package springboot2.reactive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger("springboot2.reactive");

    @Autowired
    Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) {
        logger.trace("Application started, initialize client....");

        HelloWorldClient hwc = new HelloWorldClient();
        logger.trace(hwc.getResult());

        logger.trace("Listening on localhost:" + environment.getProperty("server.port"));
    }
}
