package com.ahouzi.reactive.repositories.reactive;

import com.ahouzi.reactive.domain.Recipe;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by aah on 31/12/17.
 */
public interface RecipeReactiveRepository extends ReactiveMongoRepository<Recipe,String> {
}
