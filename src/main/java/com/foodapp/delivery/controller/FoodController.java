package com.foodapp.delivery.controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodapp.delivery.entity.FoodItem;
import com.foodapp.delivery.service.FoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService service;

    @PostMapping
    public FoodItem addFood(@RequestBody FoodItem food) {
        return service.save(food);
    }

    @GetMapping
    public List<FoodItem> getFoods() {
        return service.getAll();
    }
}
