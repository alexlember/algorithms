package ru.lember.leetcode.hasht;

import java.util.*;

/**
 * Medium
 *
 * Given an array of strings, group anagrams together.
 *
 * Example:
 *
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * Note:
 *
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 */
public class GroupAnagrams {

    /**
     * Complexity Analysis
     *
     * Time Complexity: O(NKlogK), where N is the length of strs, and K is the maximum length of a string in strs.
     * The outer loop has complexity O(N) as we iterate through each string. Then, we sort each string in O(KlogK) time.
     *
     * Space Complexity: O(NK), the total information content stored in ans.
     */
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            List<String> list = map.computeIfAbsent(composeKey(s), k -> new ArrayList<>());
            list.add(s);
        }

        return new ArrayList<>(map.values());
    }

    private String composeKey(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

}
