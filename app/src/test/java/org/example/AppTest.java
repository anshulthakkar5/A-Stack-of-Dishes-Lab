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
        DishStack stack = new DishStack(2);

        stack.push(new Dish("Pizza"));
        stack.push(new Dish("Burger"));

        assertEquals(2, stack.size());
    }

    @Test
    void testPop() {
        DishStack stack = new DishStack(2);

        stack.push(new Dish("Pizza"));
        stack.push(new Dish("Burger"));

        Dish popped = stack.pop();

        assertEquals("Burger", popped.description);
        assertEquals(1, stack.size());
    }

    @Test
    void testPeek() {
        DishStack stack = new DishStack(2);

        stack.push(new Dish("Pizza"));
        stack.push(new Dish("Burger"));

        Dish top = stack.peek();

        assertEquals("Burger", top.description);
        assertEquals(2, stack.size());
    }

    @Test
    void testStackFull() {
        DishStack stack = new DishStack(1);

        stack.push(new Dish("Pizza"));
        stack.push(new Dish("Burger")); // should not be added

        assertEquals(1, stack.size());
    }

    @Test
    void testEmptyStack() {
        DishStack stack = new DishStack(2);

        assertNull(stack.pop());
        assertNull(stack.peek());
    }
}
