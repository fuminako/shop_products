package com.example.shop.service;

import com.example.shop.component.Basket;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final Basket basket;

    public OrderService(Basket basket) {
        this.basket = basket;
    }

    public void addToBasket(List<Integer> idsToAdd) {
        basket.addToBasket(idsToAdd);

    }

    public List<Integer> getItems() {
        return basket.getBasketContent();
    }
}