package org.example;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        // Driver program to test stack
        DishStack stack = new DishStack(2);

        stack.push(new Dish("Pizza"));
        stack.push(new Dish("Burger"));
        stack.push(new Dish("Pasta")); // should print "Stack is full"

        System.out.println("Top dish: " + stack.peek().description);
        System.out.println("Size: " + stack.size());

        System.out.println("Popped: " + stack.pop().description);
        System.out.println("Size after pop: " + stack.size());
    }
}
