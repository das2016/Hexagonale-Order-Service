package fr.example.demo.infrastructure.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Component;

import fr.example.demo.domain.Order;
import fr.example.demo.domain.port.OrderRepository;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class MongoDbOrderRepository implements OrderRepository {

	private final SpringDataMongoOrderRepository orderRepository;

	@Override
	public Optional<Order> findById(UUID id) {
		return orderRepository.findById(id);
	}

	@Override
	public void save(Order order) {
		orderRepository.save(order);
	}

}
