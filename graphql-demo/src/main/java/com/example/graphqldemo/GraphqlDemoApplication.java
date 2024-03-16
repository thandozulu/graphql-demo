package com.example.graphqldemo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GraphqlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphqlDemoApplication.class, args);
	}

	@Bean
	ApplicationRunner applicationRunner(AuthorRepository authorRepository) {
		return args -> {
			Author josh = authorRepository.save(Author.builder().name("Josh").build());
			Author chad = authorRepository.save(Author.builder().name("Chad").build());
		};
	}
}
