package com.example.mymongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.example.mymongodb.repository")
public class MyMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyMongodbApplication.class, args);
	}

}
