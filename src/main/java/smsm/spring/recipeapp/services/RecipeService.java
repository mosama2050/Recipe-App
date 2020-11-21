package smsm.spring.recipeapp.services;


import smsm.spring.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}