package com.ahouzi.reactive.repositories.reactive;

import com.ahouzi.reactive.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

/**
 * Created by aah on 31/12/17.
 */
public interface CategoryReactiveRepository extends ReactiveMongoRepository<Category,String> {

    Mono<Category> findByDescription(String description);
}
