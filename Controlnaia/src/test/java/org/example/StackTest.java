package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
    private Stack stack;

    @BeforeEach
    void setUp () {
        stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
    }

    @Test
    void push () {
        Assertions.assertEquals(stack.peek(), 3);
    }

    @Test
    void pop () {
        stack.pop();
        Assertions.assertEquals(stack.peek(), 2);
    }

    @Test
    void empty () {
        stack.pop();
        stack.pop();
        stack.pop();
        Assertions.assertTrue(stack.empty());
    }

    @Test
    void peek () {
        Assertions.assertEquals(stack.peek(), 3);
    }
}
