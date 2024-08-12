package br.edu.ifpb.exemplosjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class DACApplication {

    public static void main(String[] args) {
        SpringApplication.run(DACApplication.class, args);
    }

}
