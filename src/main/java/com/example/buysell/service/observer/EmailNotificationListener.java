package com.example.buysell.service.observer;

import com.example.buysell.models.Product;
import com.example.buysell.models.User;

public class EmailNotificationListener implements EventListener {
   private final User user;

    public EmailNotificationListener(User user) {
        this.user = user;
    }

    @Override
    public void update(String eventType, Product product) {
        System.out.println("Email to " + user.getEmail() + ": Someone has performed " + eventType + " operation with the following product: " + product.getTitle());

    }
}