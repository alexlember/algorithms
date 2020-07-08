package ru.lember.leetcode.stack;

import java.util.Stack;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 */
public class MinStack {

    private final Stack<Integer> stack;
    private final Stack<Integer> min;

    /**
     * initialize your data structure here.
     *
     * Можно сделать на 1 стеке, пушить по 2 элемента сразу и так же доставать.
     */
    public MinStack() {
        stack = new Stack<>();
        min = new Stack<>();
    }

    public void push(int x) {

        stack.push(x);

        if (min.isEmpty()) {
            min.push(x);
        } else {
            int currentMin = min.peek();
            if (currentMin < x) {
                min.push(currentMin);
            } else {
                min.push(x);
            }
        }
    }

    public void pop() {
        stack.pop();
        min.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }


}
