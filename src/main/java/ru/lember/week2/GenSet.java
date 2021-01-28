package ru.lember.week2;

import java.lang.reflect.Array;
import java.util.Stack;

public class GenSet<E> {

    private E[] a; // начиная с java8 появилась возможность создавать generic array?

    public GenSet(Class<E> c, int s) {
        // Use Array native method to create array
        // of a type only known at run time
        @SuppressWarnings("unchecked")
        final E[] a = (E[]) Array.newInstance(c, s);
        this.a = a;
    }

    E get(int i) {
        return a[i];
    }

    public static void main(String ... args) {
        int n = 50;

        Stack<Integer> stack = new Stack<Integer>();
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }
    }
}