package com.example.order.ports;

import com.example.order.domain.Order;

public interface OrderRepository {
    void save(Order order);
    Order findById(String id);
}
