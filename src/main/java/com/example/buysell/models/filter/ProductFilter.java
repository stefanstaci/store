package com.example.buysell.models.filter;

import com.example.buysell.models.Product;

import java.util.List;

public interface ProductFilter {
    List<Product> filter(List<Product> products);
}
