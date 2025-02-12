package com.example.order.domain;

import lombok.Data;

@Data
public class Order {
    private String id;
    private String productName;
    private int quantity;
}
