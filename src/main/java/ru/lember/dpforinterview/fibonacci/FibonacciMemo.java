package ru.lember.dpforinterview.fibonacci;

import java.util.*;

// top - down.
// O(n^3) complexity
public class FibonacciMemo {

    private Map<Integer, Integer> memo = new HashMap<>();

    public int fib(int n) {

        Integer cached = memo.get(n);
        if (cached != null) {
            return cached;
        }

        if (n == 0) {
            memo.put(n, 0);
        } else if (n == 1 || n == 2) {
            memo.put(n, 1);
        } else {
            int res = fib(n - 1) + fib(n - 2);
            memo.put(n, res);
        }


        return memo.get(n);
    }
}
