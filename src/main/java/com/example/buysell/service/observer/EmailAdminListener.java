package com.example.buysell.service.observer;

import com.example.buysell.models.Product;

public class EmailAdminListener implements EventListener {

    @Override
    public void update(String eventType, Product product) {
        System.out.println("Email to admin@gmail.com: Someone has performed " + eventType + " operation with the following product: " + product.getTitle());

    }
}