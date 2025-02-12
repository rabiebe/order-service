package com.example.order.adapters.notifications;

import org.springframework.stereotype.Component;

import com.example.order.domain.Order;
import com.example.order.ports.OrderNotifier;

@Component
public class OrderNotifierImpl implements OrderNotifier {

    @Override
    public void notify(Order order) {
        System.out.println("Notification: Order created for product - " + order.getProductName());
    }
    
}
