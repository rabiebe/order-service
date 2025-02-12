package com.example.order.adapters.database;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.example.order.domain.Order;
import com.example.order.ports.OrderRepository;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private final Map<String, Order> orders = new HashMap<>();

    @Override
    public void save(Order order) {
        orders.put(order.getId(), order);
    }

    @Override
    public Order findById(String id) {
        return orders.get(id);
    }
}
