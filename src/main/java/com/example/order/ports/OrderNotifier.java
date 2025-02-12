package com.example.order.ports;

import com.example.order.domain.Order;

public interface OrderNotifier {
    void notify(Order order);
}
