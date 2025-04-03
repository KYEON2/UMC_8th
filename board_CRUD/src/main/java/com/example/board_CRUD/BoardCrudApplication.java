package com.example.board_CRUD;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BoardCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoardCrudApplication.class, args);
	}

}
