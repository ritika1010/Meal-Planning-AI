package com.planning.mealsandrecipes.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class RecipeTests {

    private Recipe recipe1;
    private Recipe recipe2;

    @BeforeEach
    public void setUp() {
        recipe1 = new Recipe();
        recipe1.setRecipeId(1);
        recipe1.setRecipeName("Spaghetti Carbonara");
        recipe1.setDescription("A classic Italian pasta dish.");
        recipe1.setInstructions("Cook pasta, mix with egg and cheese sauce, add pancetta.");
        recipe1.setPreparationTime(15);
        recipe1.setCookingTime(20);

        recipe2 = new Recipe();
        recipe2.setRecipeId(2);
        recipe2.setRecipeName("Chicken Alfredo");
        recipe2.setDescription("Creamy chicken pasta.");
        recipe2.setInstructions("Cook chicken, mix with creamy sauce, serve over pasta.");
        recipe2.setPreparationTime(20);

    }

    @Test
    public void testEquals() {
        assertEquals(recipe1, recipe1);
        assertNotEquals(recipe1, recipe1);
    }

    @Test
    public void testHashCode() {
        assertEquals(recipe1.hashCode(), recipe2.hashCode());
        assertNotEquals(recipe1.hashCode(), recipe2.hashCode());
    }

    @Test
    public void testGetName() {
        assertEquals("Chicken Alfredo", recipe2.getRecipeName());
    }

}