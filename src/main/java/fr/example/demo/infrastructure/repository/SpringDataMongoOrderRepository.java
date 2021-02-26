package fr.example.demo.infrastructure.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import fr.example.demo.domain.Order;

@Repository
public interface SpringDataMongoOrderRepository extends MongoRepository<Order, UUID> {

}
