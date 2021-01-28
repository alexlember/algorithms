package ru.lember.week2;

import java.util.Stack;

public class QueueWithTwoStacks<T> {

    Stack<T> inbox = new Stack<>();
    Stack<T> outbox = new Stack<>();

    public void enquque(T t) {
        inbox.push(t);
    }

    public T dequeue() {

        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }

        return outbox.pop();
    }

    boolean isEmpty() {
        return inbox.isEmpty() && outbox.isEmpty();
    }


    public static void main(String ... args) {

    }
}
