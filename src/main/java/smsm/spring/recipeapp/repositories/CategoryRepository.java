package smsm.spring.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import smsm.spring.recipeapp.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
