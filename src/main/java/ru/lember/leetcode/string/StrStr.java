package ru.lember.leetcode.string;

/**
 *
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */
public class StrStr {


    int strStr(String haystack, String needle) {

        if (haystack == null || needle == null) {
            return -1;
        }

        if (haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        } else if (haystack.isEmpty()) {
            return -1;
        } else if (needle.isEmpty()) {
            return 0;
        }


        int needleLen = needle.length();
        int haystackLen = haystack.length();

        if (needleLen > haystackLen) {
            return -1;
        }


        int i = 0;
        while (i + needleLen <= haystackLen) {

            if (haystack.substring(i, i + needleLen).equals(needle)) { // could be done with another cycle inside and using charAt
                return i;
            }

            i++;
        }


        return -1;
    }

}
