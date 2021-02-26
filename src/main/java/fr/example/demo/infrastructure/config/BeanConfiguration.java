package fr.example.demo.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.example.demo.domain.adapter.DomainOrderService;
import fr.example.demo.domain.adapter.OrderService;
import fr.example.demo.domain.port.OrderRepository;

@Configuration
public class BeanConfiguration {

	@Bean
	OrderService orderService(OrderRepository orderRepository) {
		return new DomainOrderService(orderRepository);
	}
}
