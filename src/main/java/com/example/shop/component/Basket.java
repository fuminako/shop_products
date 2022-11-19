package com.example.shop.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class Basket {

    private final List<Integer> userBasket = new ArrayList<>();

    public void addToBasket(List<Integer> idsToAdd) {
        userBasket.addAll(idsToAdd);
    }

    public List<Integer> getBasketContent() {
        return Collections.unmodifiableList(userBasket);
    }
}
