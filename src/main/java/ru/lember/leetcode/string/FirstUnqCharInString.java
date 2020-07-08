package ru.lember.leetcode.string;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 * <p>
 * Examples:
 * <p>
 * s = "leetcode"
 * return 0.
 * <p>
 * s = "loveleetcode",
 * return 2.
 * <p>
 * <p>
 * Note: You may assume the string contain only lowercase English letters.
 */
public class FirstUnqCharInString {

    int firstUniqChar(String s) {

        if (s == null || s.isEmpty()) {
            return -1;
        }

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character c : s.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.put(c, map.get(c) + 1);
        }

        int index = 0;
        for (Character c : s.toCharArray()) {
            Integer occurs = map.get(c);
            if (occurs == 1) {
                return index;
            }
            index++;
        }


        return -1;

    }

    int firstUniqCharAlt(String s) {
        // - 'a' (to int?)
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;
        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }

}
