package com.foodapp.delivery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodapp.delivery.entity.FoodItem;
import com.foodapp.delivery.repository.FoodRepository;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository repo;

    public FoodItem save(FoodItem food) {
        return repo.save(food);
    }

    public List<FoodItem> getAll() {
        return repo.findAll();
    }
}