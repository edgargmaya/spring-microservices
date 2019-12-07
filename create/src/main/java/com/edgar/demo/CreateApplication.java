package com.edgar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/*
 * Nota: Podemos definir multiples paquetes que serán escaneados y asi poder crear SpringBeans dentro del mismo contexto
 * Note: We can define multiple packages to be scaned, in order to get SpringBeans up and running in the spring-container
 * */
@SpringBootApplication( scanBasePackages = {"com.edgar"})

/*
 * Nota: Utilizamos la anotación @EnableMongoRepositories cuando los 'Repositories' se encuentran en otro paquete
 * Note: We use the @EnableMongoRepositories notation when the 'Repositories' are inside another package
 * */
@EnableMongoRepositories("com.core")
public class CreateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateApplication.class, args);
	}

}