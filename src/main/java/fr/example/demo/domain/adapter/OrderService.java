package fr.example.demo.domain.adapter;

import java.util.UUID;

import fr.example.demo.domain.Product;

public interface OrderService {
	UUID createOrder(Product product);

	void addProduct(UUID id, Product product);

	void completeOrder(UUID id);

	void deleteProduct(UUID id, UUID productId);
}
