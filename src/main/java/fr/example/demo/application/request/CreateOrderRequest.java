package fr.example.demo.application.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

import fr.example.demo.domain.Product;

public class CreateOrderRequest {
	@NotNull
	private Product product;

	@JsonCreator
	public CreateOrderRequest(@JsonProperty("product") @NotNull final Product product) {
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

}
