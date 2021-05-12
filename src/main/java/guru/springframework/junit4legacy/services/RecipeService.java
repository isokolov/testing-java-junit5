package guru.springframework.junit4legacy.services;

import guru.springframework.junit4legacy.domain.Recipe;

import java.util.Set;

/**
 * Created by jt on 6/13/17.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();
}
