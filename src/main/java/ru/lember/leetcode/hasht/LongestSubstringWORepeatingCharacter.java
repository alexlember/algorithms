package ru.lember.leetcode.hasht;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * medium
 *
 * Given a string, find the length of the longest substring without repeating characters.
 *
 * Example 1:
 *
 * Input: "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 *              Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWORepeatingCharacter {

    public int lengthOfLongestSubstring(String s) {

        Set<Character> currentSubstring = new HashSet<>();
        int longest = 0;

        int lastBeginSubstringIndex = 0;
        int currentRunner = lastBeginSubstringIndex;

        int stringLength = s.length();

        while (lastBeginSubstringIndex < stringLength && (stringLength - lastBeginSubstringIndex) > longest) {

            for (int i = currentRunner; i < s.length(); i++) {
                // здесь есть лишняя работа, основная идея в том, что если на промежутке i -> j - 1 нет дублей, то мы можем проверить что на промежутке i -> j нет дублей, если узнаем, что s[j] нет в i -> j - 1.
                // если мы встретили дубль, нам надо просто подвинуть левую сторону на 1 шаг вправо, мы уже знаем, что строка уникальная.

                char current = s.charAt(i);

                boolean unique = currentSubstring.add(current);

                int currentSubstringLength = currentSubstring.size();
                if (longest < currentSubstringLength) {
                    longest = currentSubstringLength;
                }

                if (!unique) {
                    currentSubstring.clear();
                    break;
                }

            }

            lastBeginSubstringIndex++;
            currentRunner = lastBeginSubstringIndex;

        }



        return longest;
    }

    public int lengthOfLongestSubstringOptimized(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

}
