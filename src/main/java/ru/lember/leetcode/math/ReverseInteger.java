package ru.lember.leetcode.math;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1].
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class ReverseInteger {

    // shitty solution.
    int reverse(int x) {

        boolean isNegative = x < 0;

        int result;

        try {
            result = Integer.parseInt(reverse(String.valueOf(isNegative ? Math.abs(x) : x)));
        } catch (NumberFormatException e) {
            return 0;
        }

        return isNegative ? (result * (-1)) : result;
    }

    private String reverse(String s) {

        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }


    private static final int MAX_INT_DIV_BY_10 = Integer.MAX_VALUE / 10;
    private static final int MIN_INT_DIV_BY_10 = Integer.MIN_VALUE / 10;

    /**
     * Reversing an integer can be done similarly to reversing a string.
     *
     * We want to repeatedly "pop" the last digit off of xx and "push" it to the back of the rev.
     * In the end, rev will be the reverse of the xx.
     *
     * To "pop" and "push" digits without the help of some auxiliary stack/array, we can use math.
     *
     * Explanation:
     * The biggest number an Integer can hold in space is 2147483647,
     * (Integer.MAX_VALUE / 10) is equal to 214748364,
     * so if the pop is more then 7 that means that an Integer can't hold that amount of space.
     * The same logic goes into -8 which is Integer.MIN_VALUE.
     *
     */
    int reverseOfHealthMan(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10; // pop
            x /= 10;
            if (rev > MAX_INT_DIV_BY_10 || (rev == MAX_INT_DIV_BY_10 && pop > 7)) return 0;
            if (rev < MIN_INT_DIV_BY_10 || (rev == MIN_INT_DIV_BY_10 && pop < -8)) return 0;
            rev = rev * 10 + pop; // push
        }
        return rev;
    }

}
