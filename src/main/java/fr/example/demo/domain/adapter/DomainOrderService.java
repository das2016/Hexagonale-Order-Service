package fr.example.demo.domain.adapter;

import java.util.UUID;

import fr.example.demo.domain.Order;
import fr.example.demo.domain.Product;
import fr.example.demo.domain.port.OrderRepository;

public class DomainOrderService implements OrderService {
	private final OrderRepository orderRepository;

	public DomainOrderService(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	@Override
	public UUID createOrder(Product product) {
		Order order = new Order(UUID.randomUUID(), product);
		orderRepository.save(order);
		return order.getId();
	}

	@Override
	public void addProduct(UUID id, Product product) {
		Order order = getOrder(id);
		order.addOrder(product);
		orderRepository.save(order);
	}

	@Override
	public void completeOrder(UUID id) {
		Order order = getOrder(id);
		order.complete();
		orderRepository.save(order);
	}

	@Override
	public void deleteProduct(UUID id, UUID productId) {
		Order order = getOrder(id);
		order.removeOrder(id);
		orderRepository.save(order);
	}

	private Order getOrder(UUID id) {
		return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order with uuid" + id + "is null"));
	}

}
