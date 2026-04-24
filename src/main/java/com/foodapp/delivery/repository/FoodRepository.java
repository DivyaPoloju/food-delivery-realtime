package com.foodapp.delivery.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.foodapp.delivery.entity.FoodItem;

public interface FoodRepository extends JpaRepository<FoodItem, Long> {
}