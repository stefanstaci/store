package com.example.buysell.models.filter;

import com.example.buysell.models.Product;

import java.util.ArrayList;
import java.util.List;

public class CityFilter implements ProductFilter {
    @Override
    public List<Product> filter(List<Product> products) {
        List<Product> list = new ArrayList<>();
        for (Product iphone : products) {
            if (iphone.getCity().equals("Chisinau")) {
                list.add(iphone);
            }
        }
        return list;
    }
}
