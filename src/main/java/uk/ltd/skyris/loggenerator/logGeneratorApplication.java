package uk.ltd.skyris.loggenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class logGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(logGeneratorApplication.class, args);
    }

}

