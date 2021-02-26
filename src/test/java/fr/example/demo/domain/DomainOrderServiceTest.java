package fr.example.demo.domain;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.math.BigDecimal;
import java.util.UUID;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import fr.example.demo.domain.adapter.DomainOrderService;
import fr.example.demo.domain.port.OrderRepository;

class DomainOrderServiceTest {
	
	private OrderRepository orderRepository;
	private DomainOrderService domainOrderService;
	
	@BeforeEach
	public void setUp() {
		orderRepository = mock(OrderRepository.class);
		domainOrderService = new DomainOrderService(orderRepository);
	}

	@Test
	void should_crete_order_and_saved_it() {
		final Product product = new Product(UUID.randomUUID(), BigDecimal.TEN);
		final UUID id = domainOrderService.createOrder(product);
		verify(orderRepository).save(Mockito.any(Order.class));
		assertNotNull(id);
	}
}
