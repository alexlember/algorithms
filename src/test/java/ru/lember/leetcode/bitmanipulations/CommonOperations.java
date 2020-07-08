package ru.lember.leetcode.bitmanipulations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommonOperations {


    @Test
    void testLogicalBitOperations() {

        int a = 0;
        int b = 0;

        Assertions.assertEquals(0, a | b);
        Assertions.assertEquals(0, a & b);
        Assertions.assertEquals(0, a ^ b);
        Assertions.assertEquals(-1, ~a);

        a = 1;
        b = 0;

        Assertions.assertEquals(1, a | b);
        Assertions.assertEquals(0, a & b);
        Assertions.assertEquals(1, a ^ b);
        Assertions.assertEquals(-2, ~a);

        a = 0;
        b = 1;

        Assertions.assertEquals(1, a | b);
        Assertions.assertEquals(0, a & b);
        Assertions.assertEquals(1, a ^ b);
        Assertions.assertEquals(-1, ~a);

        a = 1;
        b = 1;

        Assertions.assertEquals(1, a | b);
        Assertions.assertEquals(1, a & b);
        Assertions.assertEquals(0, a ^ b);
        Assertions.assertEquals(-2, ~a);


        byte c = 47;
        Assertions.assertEquals(-48, ~c);
        Assertions.assertEquals("101111", Integer.toBinaryString(c));
        Assertions.assertEquals("11111111111111111111111111010000", Integer.toBinaryString(~c));

        short d = 350;
        Assertions.assertEquals(-351, ~d);
        Assertions.assertEquals("101011110", Integer.toBinaryString(d));
        Assertions.assertEquals("11111111111111111111111010100001", Integer.toBinaryString(~d));


        int e = 5555555;
        Assertions.assertEquals(-5555556, ~e);
        Assertions.assertEquals("10101001100010101100011", Integer.toBinaryString(e));
        Assertions.assertEquals("11111111101010110011101010011100", Integer.toBinaryString(~e));

        long g = 111112222233333L;
        Assertions.assertEquals(-111112222233334L, ~g);
        Assertions.assertEquals("11001010000111001010100100010010101001011110101", Long.toBinaryString(g));
        Assertions.assertEquals("1111111111111111100110101111000110101011011101101010110100001010", Long.toBinaryString(~g));

        // для получения противоположного числа нужно проинтертировать через ~, потом добавить 1.

    }

    @Test
    void logicalAnd() {

        int a = 7;
        int b = 5;
        int c = a & b;
        Assertions.assertEquals("111", Integer.toBinaryString(a));
        Assertions.assertEquals("101", Integer.toBinaryString(b));
        Assertions.assertEquals("101", Integer.toBinaryString(c));
    }

    @Test
    void logicalOr() {

        int a = 7;
        int b = 5;
        int c = a | b;
        Assertions.assertEquals("111", Integer.toBinaryString(a));
        Assertions.assertEquals("101", Integer.toBinaryString(b));
        Assertions.assertEquals("111", Integer.toBinaryString(c));
    }

    @Test
    void logicalXor() {

        int a = 7;
        int b = 5;
        int c = a ^ b;
        Assertions.assertEquals("111", Integer.toBinaryString(a));
        Assertions.assertEquals("101", Integer.toBinaryString(b));
        Assertions.assertEquals("010", Integer.toBinaryString(c));
    }

    /**
     * Сдвиг влево = умножение на 2
     */
    @Test
    void shiftLeft() {

        int a = 1;
        int b = 1;

        a = a << b;
        Assertions.assertEquals("10", Integer.toBinaryString(a));

        a = a << b;
        Assertions.assertEquals("100", Integer.toBinaryString(a));

        a = a << b;
        Assertions.assertEquals("1000", Integer.toBinaryString(a));

    }

    /**
     * Сдвиг вправо = деление на 2.
     *
     * А что если другие числа не кратные двум? В таком случае, если число нацело не делится,
     * тогда оно уменьшается на остаток от деления или на единицу,
     * чтобы таким образом трансформироваться в кратное двум! Возьмем число 35 к примеру.
     *
     * А так же важно заметить, что когда число равно нулю,
     * в таком случае при побитовом сдвиге вправо число останеться нулем!
     *
     * При отрицательных числах так же, как и при положительных числа, только сохраняя свой знак "-".
     */
    @Test
    void shiftRight() {

        int a = 1024;
        int b = 1;

        a = a >> b;
        Assertions.assertEquals("1000000000", Integer.toBinaryString(a));

        a = a >> b;
        Assertions.assertEquals("100000000", Integer.toBinaryString(a));

        a = a >> b;
        Assertions.assertEquals("10000000", Integer.toBinaryString(a));

        a = 1 >> 1;
        Assertions.assertEquals("0", Integer.toBinaryString(a));

        a = 512 >> 2;
        Assertions.assertEquals("10000000", Integer.toBinaryString(a));
    }

    @Test
    void shiftRightWithZeroes() {
        int a = -1;
        int b = 1;
        for (int i = 0; i < 32; i++) {
            System.out.println("Число: " + a);
            int c = a >>> b;
            System.out.println("Представление числа: " + a + " в двоичной системе исчисления: " + Integer.toBinaryString(a));
            System.out.println("Представление числа: " + c + " в двоичной системе исчисления: " + Integer.toBinaryString(c));
            System.out.println("Результат: " + c);
            a = c;
        }
    }
}
