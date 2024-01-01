package com.example.dockerize;

import com.example.dockerize.entity.Product;
import com.example.dockerize.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerizeApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ProductService productService) {
		return args -> {
			productService.saveAll(new Product(null, "cafe",100000.0,"ok"));
			productService.saveAll(new Product(null, "water",200000.0,"ok"));
			productService.saveAll(new Product(null, "cacao",300000.0,"ok"));
			productService.saveAll(new Product(null, "milk",400000.0,"ok"));
		};
	}
}
