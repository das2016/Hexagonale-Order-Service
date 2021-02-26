package fr.example.demo.application.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import fr.example.demo.domain.Product;

public class AddProductRequest {
	@NotNull
	private Product product;

	@JsonCreator
	public AddProductRequest(@JsonProperty("product") final Product product) {
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}
}
