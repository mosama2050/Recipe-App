package smsm.spring.recipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import smsm.spring.recipeapp.domain.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
