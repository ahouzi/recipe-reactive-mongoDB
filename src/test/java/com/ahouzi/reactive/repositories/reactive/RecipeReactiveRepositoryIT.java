package com.ahouzi.reactive.repositories.reactive;

import com.ahouzi.reactive.domain.Recipe;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by aah on 31/12/17.
 */

@RunWith(SpringRunner.class)
@DataMongoTest
public class RecipeReactiveRepositoryIT {

    @Autowired
    RecipeReactiveRepository recipeReactiveRepository ;

    @Before
    public void setUp() throws Exception {
        recipeReactiveRepository.deleteAll().block();
    }

    @Test
    public void testRecipeSave() throws Exception{

        Recipe recipe = new Recipe();
        recipe.setDescription("Yummy");

        recipeReactiveRepository.save(recipe).block();

        assertEquals(Long.valueOf(1L),recipeReactiveRepository.count().block());

    }


}