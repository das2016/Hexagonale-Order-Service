package fr.example.demo.domain;

import java.math.BigDecimal;
import java.util.UUID;

public class Product {
	private UUID id;
	private BigDecimal price;

	public Product(UUID id, BigDecimal price) {
		super();
		this.id = id;
		this.price = price;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public UUID getId() {
		return id;
	}

}
