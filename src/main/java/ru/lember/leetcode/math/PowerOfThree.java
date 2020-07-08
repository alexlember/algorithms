package ru.lember.leetcode.math;

/**
 * Given an integer, write a function to determine if it is a power of three.
 *
 * Example 1:
 *
 * Input: 27
 * Output: true
 * Example 2:
 *
 * Input: 0
 * Output: false
 * Example 3:
 *
 * Input: 9
 * Output: true
 * Example 4:
 *
 * Input: 45
 * Output: false
 * Follow up:
 * Could you do it without using any loop / recursion?
 *
 *
 */
public class PowerOfThree {

    boolean isPowerOfThree(int n) {


        int temp = n;

        while (temp > 1) {
            if (temp % 3 != 0) {
                return false;
            }
            temp = temp / 3;
        }

        return temp == 1;
    }

    boolean isPowerOfThreeMath(int n) {
        return (Math.log10(n) / Math.log10(3)) % 1 == 0;
    }


    /**
     * Knowing the limitation of n, we can now deduce that the maximum value of n that is also a power of three is 1162261467. We calculate this as:
     *
     * 3^{\lfloor{}\log_3{MaxInt}\rfloor{}} = 3^{\lfloor{}19.56\rfloor{}} = 3^{19} = 11622614673
     * ⌊log
     * 3
     * ​
     *  MaxInt⌋
     *  =3
     * ⌊19.56⌋
     *  =3
     * 19
     *  =1162261467
     *
     * Therefore, the possible values of n where we should return true are 3^03
     * 0
     *  , 3^13
     * 1
     *   ... 3^{19}3
     * 19
     *  . Since 3 is a prime number, the only divisors of 3^{19}3
     * 19
     *   are 3^03
     * 0
     *  , 3^13
     * 1
     *   ... 3^{19}3
     * 19
     *  , therefore all we need to do is divide 3^{19}3
     * 19
     *   by n. A remainder of 0 means n is a divisor of 3^{19}3
     * 19
     *   and therefore a power of three.
     */
    boolean isPowerOfThreeIntegerLimitation(int n) {
        return n > 0 && 1162261467 % n == 0;
    }

}
