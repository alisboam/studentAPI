package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.JANUARY;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        System.out.println("passou aqui");
        return args -> {
            Student maria = new Student(
                "Maria",
                "maria@email.com",
                LocalDate.of(2000, JANUARY, 5)
            );

            Student alex = new Student(
                "Alex",
                "alex@email.com",
                LocalDate.of(2002, JANUARY, 5)
            );

            repository.saveAll(
                List.of(maria,alex)
            );
        };
    }
}
