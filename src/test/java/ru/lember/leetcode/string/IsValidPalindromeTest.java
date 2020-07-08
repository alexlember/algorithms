package ru.lember.leetcode.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IsValidPalindromeTest {


    @Test
    void isValidPalindromeTest() {


        ValidPalindrome service = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(service.isPalindrome(s));

        s = "race a car";
        Assertions.assertFalse(service.isPalindrome(s));

    }

}
