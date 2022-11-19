
package com.example.shop.controller;

import com.example.shop.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void addItems(@RequestParam("id") List<Integer> idsToAdd) {
        this.orderService.addToBasket(idsToAdd);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return this.orderService.getItems();
    }
}