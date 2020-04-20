package com.abi.mongodb.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

//@SpringBootApplication(exclude = { MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
@SpringBootApplication
//@EnableMongoRepositories(basePackages = {"package com.abi.mongodb.training.repository"})
public class AbiMongodbTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbiMongodbTrainingApplication.class, args);
	}

}
