package com.lekwacious.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.lekwacious.repository"})
@EntityScan(basePackages = {"com.lekwacious.domain"})
@ComponentScan(basePackages = {"com.lekwacious.**"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);

    }
}
