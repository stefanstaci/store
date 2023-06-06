package com.example.buysell.service.observer;

import com.example.buysell.models.Product;


public interface EventListener {
    void update(String eventType, Product product);
}