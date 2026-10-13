package com.example.restaurantservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {
    @GetMapping("/restaurants")
    public String getRestaurants() {
        return "Restaurant Service is running!";
    }
}
