package com.example.basket_211.service;

import java.util.Set;

public interface BasketService {
    void add(Set<Integer> codeIds);

    Set<Integer> getAllItems();
}
