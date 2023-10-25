package com.planning.mealsandrecipes.controller;
import com.planning.mealsandrecipes.MealModel;
import com.planning.mealsandrecipes.service.MealPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealPlanController {
    @Autowired
    private MealPlanService mealPlanService;


    @GetMapping("/{mealType}/{recipeType}")
    public List<MealModel> getMeal(@PathVariable String mealType, @PathVariable String recipeType) {
        return mealPlanService.getMeal(mealType, recipeType);
    }



}