package br.com.padroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot 3 com Java 21.
 * Módulos: Spring Data JPA, Spring Web, H2, OpenFeign, Springdoc OpenAPI.
 *
 * Padrões aplicados:
 * - Singleton  → beans gerenciados pelo container Spring (@Service, @Repository)
 * - Strategy   → interface ClienteService com implementação injetável
 * - Facade     → ClienteRestController abstraindo JPA + ViaCEP
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
