package org.example;

public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    // Stack implementation using array
    public static class DishStack {
        private Dish[] stack;
        private int top;
        private int capacity;

        public DishStack(int capacity) {
            this.capacity = capacity;
            this.stack = new Dish[capacity];
            this.top = -1;
        }

        // push
        public void push(Dish dish) {
            if (top == capacity - 1) {
                System.out.println("Stack is full");
                return;
            }
            stack[++top] = dish;
        }

        // pop
        public Dish pop() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return null;
            }
            return stack[top--];
        }

        // peek
        public Dish peek() {
            if (top == -1) {
                System.out.println("Stack is empty");
                return null;
            }
            return stack[top];
        }

        // size
        public int size() {
            return top + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
