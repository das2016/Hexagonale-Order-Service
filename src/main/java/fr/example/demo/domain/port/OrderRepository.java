package fr.example.demo.domain.port;

import java.util.Optional;
import java.util.UUID;

import fr.example.demo.domain.Order;

public interface OrderRepository {

	Optional<Order> findById(UUID id);

	void save(Order order);
}
