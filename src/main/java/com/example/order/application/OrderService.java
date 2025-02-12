package com.example.order.application;

import org.springframework.stereotype.Service;

import com.example.order.domain.Order;
import com.example.order.ports.OrderNotifier;
import com.example.order.ports.OrderRepository;

import lombok.Data;

@Service
@Data
public class OrderService {
    private final OrderRepository orderRepository;
    private final OrderNotifier orderNotifier;

    public void createOrder(Order order) {
        orderRepository.save(order);
        orderNotifier.notify(order);
    }

    public Order getOrder(String id) {
        return orderRepository.findById(id);
    }
}
