package com.example.basket_211.controller.BasketController;

import com.example.basket_211.service.BasketService;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@Scope("session")
@RequestMapping("/store/order/")

public class BasketController {

    private final BasketService basketService;

    public BasketController(BasketService basketService) {
        this.basketService = basketService;
    }


    @GetMapping
    public String welcome () {return "<h1>Добро пожаловать в наш интернет-магазин!</h1>";}


    @GetMapping(value = "/add")
    public void addItems(
            @RequestParam("product") Set<Integer> codeIds)
        {
        basketService.add(codeIds) ;
    }

    @GetMapping(value = "/get")
    public Set<Integer> getAllItems(
            ) {
        return basketService.getAllItems();
    }




}
