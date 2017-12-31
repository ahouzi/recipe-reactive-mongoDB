package com.ahouzi.reactive.repositories.reactive;

import com.ahouzi.reactive.domain.Category;
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
public class CategoryReactiveRepositoryIT {

    @Autowired
    private CategoryReactiveRepository categoryReactiveRepository;

    @Before
    public void setUp() throws Exception {
        categoryReactiveRepository.deleteAll().block();
    }

    @Test
    public void findByDescription() throws Exception {

        Category category  = new Category();
        category.setDescription("MOE");


        categoryReactiveRepository.save(category).then().block();

        Category fetchedCat = categoryReactiveRepository.findByDescription("MOE").block();

        assertEquals("MOE",fetchedCat.getDescription());

    }


}