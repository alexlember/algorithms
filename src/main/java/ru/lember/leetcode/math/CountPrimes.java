package ru.lember.leetcode.math;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Example:
 *
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */
public class CountPrimes {

    public int countPrimes(int n) {

        if (n == 0 || n == 1 || n == 2) {
            return 0;
        }

        int numberOfPrimes = 1;
        for (int i = 3; i < n; i++) {
            if (isPrime(i)) {
                numberOfPrimes++;
            }
        }

        return numberOfPrimes;
    }

    boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}
