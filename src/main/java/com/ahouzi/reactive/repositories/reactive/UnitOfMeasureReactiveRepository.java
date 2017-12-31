package com.ahouzi.reactive.repositories.reactive;

import com.ahouzi.reactive.domain.UnitOfMeasure;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

import java.util.Optional;

/**
 * Created by aah on 31/12/17.
 */
public interface UnitOfMeasureReactiveRepository extends ReactiveMongoRepository<UnitOfMeasure,String> {

    Mono<UnitOfMeasure> findByDescription(String description);
}
