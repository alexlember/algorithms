package ru.lember.dpforinterview.fibonacci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fib() {

        FibonacciRecursive service = new FibonacciRecursive();

        Assertions.assertEquals(0, service.fib(0));
        Assertions.assertEquals(1, service.fib(1));
        Assertions.assertEquals(1, service.fib(2));
        Assertions.assertEquals(2, service.fib(3));
        Assertions.assertEquals(3, service.fib(4));
        Assertions.assertEquals(5, service.fib(5));
        Assertions.assertEquals(8, service.fib(6));
        Assertions.assertEquals(13, service.fib(7));
        Assertions.assertEquals(21, service.fib(8));


        FibonacciMemo memo = new FibonacciMemo();
        Assertions.assertEquals(0, memo.fib(0));
        Assertions.assertEquals(1, memo.fib(1));
        Assertions.assertEquals(1, memo.fib(2));
        Assertions.assertEquals(2, memo.fib(3));
        Assertions.assertEquals(3, memo.fib(4));
        Assertions.assertEquals(5, memo.fib(5));
        Assertions.assertEquals(8, memo.fib(6));
        Assertions.assertEquals(13, memo.fib(7));
        Assertions.assertEquals(21, memo.fib(8));

        FibonacciDP dp = new FibonacciDP();
        Assertions.assertEquals(0, dp.fib(0));
        Assertions.assertEquals(1, dp.fib(1));
        Assertions.assertEquals(1, dp.fib(2));
        Assertions.assertEquals(2, dp.fib(3));
        Assertions.assertEquals(3, dp.fib(4));
        Assertions.assertEquals(5, dp.fib(5));
        Assertions.assertEquals(8, dp.fib(6));
        Assertions.assertEquals(13, dp.fib(7));
        Assertions.assertEquals(21, dp.fib(8));
    }
}