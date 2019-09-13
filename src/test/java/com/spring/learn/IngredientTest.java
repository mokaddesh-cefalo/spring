package com.spring.learn;

import com.spring.learn.modelclasses.Ingredient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.spring.learn.modelclasses.Ingredient.Type.WRAP;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IngredientTest {

    @Test
    public void testIngredient()
    {
        Ingredient ingredient = new Ingredient("1", "shovon", WRAP);
        System.out.println(ingredient.toString());
    }
}
