package ru.lember.leetcode.string;

/**
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 *
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 *
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * Example 2:
 *
 * Input: "race a car"
 * Output: false
 */
public class ValidPalindrome {

    boolean isPalindrome(String s) {

        String worker = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int finish = worker.length() - 1;


        while (start < finish) {


            if (worker.charAt(start) != worker.charAt(finish)) {
                return false;
            }

            start++;
            finish--;
        }

        return true;

    }

}
