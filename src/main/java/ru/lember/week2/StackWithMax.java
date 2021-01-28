package ru.lember.week2;

import java.util.Stack;

public class StackWithMax<T extends Comparable<T>> {

    Stack<T> inbox = new Stack<>();
    Stack<T> max = new Stack<>();

    public void push(T t) {


        // compare
        inbox.push(t);
        if (inbox.size() == 1) {
            max.push(t);
        }

        if (t.compareTo(max.peek()) > 0) {
            max.push(t);
        } else {
            max.push(max.peek());
        }
    }

    public T pop() {
        max.pop();
        return inbox.pop();
    }

    public T max() {
        return max.peek();
    }

    boolean isEmpty() {
        return inbox.isEmpty();
    }


    public static void main(String ... args) {

    }
}
