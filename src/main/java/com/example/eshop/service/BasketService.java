package com.example.eshop.service;

import com.example.eshop.component.Basket;
import com.example.eshop.domain.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class BasketService {

    private final Basket basket;
    private Map<Integer, Item> items;

    public BasketService(Basket basket) {
        this.basket = basket;
        this.items = Map.of(
                1, new Item(1, "phone", 1000),
                2, new Item(2, "book", 10),
                3, new Item(3, "laptop", 2000)
        );
    }

    public void add(List<Integer> ids) {
        basket.add(
                ids.stream()
                        .map(items::get)
                        .filter(Objects::nonNull)
                        .collect(Collectors.toList())
        );
    }

    public List<Item> get() {
        return basket.get();
    }
}
