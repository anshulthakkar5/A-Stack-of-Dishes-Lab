package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App app = new App();
        assertNotNull(app.getGreeting());
    }

    @Test
    void testPushAndSize() {
        App.DishStack stack = new App.DishStack(2);

        stack.push(new Dish("Pizza"));
        stack.push(new Dish("Burger"));

        assertEquals(2, stack.size());
    }

    @Test
    void testPop() {
        App.DishStack stack = new App.DishStack(2);

        stack.push(new Dish("Pizza"));
        stack.push(new Dish("Burger"));

        Dish popped = stack.pop();

        assertEquals("Burger", popped.description);
        assertEquals(1, stack.size());
    }

    @Test
    void testPeek() {
        App.DishStack stack = new App.DishStack(2);

        stack.push(new Dish("Pizza"));
        stack.push(new Dish("Burger"));

        Dish top = stack.peek();

        assertEquals("Burger", top.description);
        assertEquals(2, stack.size()); // peek does not remove
    }

    @Test
    void testStackFull() {
        App.DishStack stack = new App.DishStack(1);

        stack.push(new Dish("Pizza"));
        stack.push(new Dish("Burger")); // should not be added

        assertEquals(1, stack.size());
    }

    @Test
    void testEmptyStack() {
        App.DishStack stack = new App.DishStack(2);

        assertNull(stack.pop());
        assertNull(stack.peek());
    }
}
