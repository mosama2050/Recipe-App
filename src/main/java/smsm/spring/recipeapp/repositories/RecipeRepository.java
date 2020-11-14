package smsm.spring.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import smsm.spring.recipeapp.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
