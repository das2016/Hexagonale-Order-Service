package fr.example.demo.infrastructure.config;

import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import fr.example.demo.infrastructure.repository.SpringDataMongoOrderRepository;

@EnableMongoRepositories(basePackageClasses = SpringDataMongoOrderRepository.class)
public class MongoDBConfiguration {

}
