package com.example.basket_211.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Set;

@Service
@SessionScope

public class BasketServiceImpl implements BasketService {

    private final Set<Integer> newBasket;

    public BasketServiceImpl(Set<Integer> newBasket) {
        this.newBasket = newBasket;
    }

    @Override
    public void add(Set<Integer> codeIds) {
        newBasket.addAll(codeIds);
            }

    @Override
    public Set<Integer> getAllItems() {
        return newBasket;
    }



}
