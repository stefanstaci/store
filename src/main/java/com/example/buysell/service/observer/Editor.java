package com.example.buysell.service.observer;

import com.example.buysell.models.Product;

import java.io.File;

public class Editor {
    public EventManager events;
    private Product product;

    public Editor() {
        this.events = new EventManager("delete", "save");
    }
}