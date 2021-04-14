package ru.lember.leetcode.dynamic;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, determine if s can be segmented into a space-separated sequence of one or more dictionary words.
 *
 * Note:
 *
 * The same word in the dictionary may be reused multiple times in the segmentation.
 * You may assume the dictionary does not contain duplicate words.
 * Example 1:
 *
 * Input: s = "leetcode", wordDict = ["leet", "code"]
 * Output: true
 * Explanation: Return true because "leetcode" can be segmented as "leet code".
 * Example 2:
 *
 * Input: s = "applepenapple", wordDict = ["apple", "pen"]
 * Output: true
 * Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
 *              Note that you are allowed to reuse a dictionary word.
 * Example 3:
 *
 * Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
 * Output: false
 */
public class WordBreak {

//    public boolean wordBreak(String s, List<String> wordDict) {
//        if (s == null || s.isEmpty()) {
//            return false;
//        }
//        String working = s;
//        while (working.length() > 0) {
//            boolean isOk = false;
//            for (String word : wordDict) {
//                if (working.startsWith(word)) {
//
//                    // вот тут на самом деле должно быть раздвоение
//
//                    isOk = true;
//                    working = working.substring(word.length());
//                    break;
//                }
//            }
//            if (!isOk) {
//                return false;
//            }
//        }
//        return true;
//    }


    Set<String> breakIndexesFails;

    public boolean wordBreak(String s, List<String> wordDict) {
        breakIndexesFails = new HashSet<>();
        return wb2(s, wordDict);
    }

    private boolean wb2(String sentence, List<String> wordDict) {
        if (sentence.length() == 0) {
            return true;
        }

        for (String word : wordDict) {
            int breakIndex = word.length();
            if (sentence.length() >= breakIndex) {
                if (sentence.startsWith(word)) {
                    String subSentence = sentence.substring(breakIndex);
                    if (breakIndexesFails.contains(subSentence)) {
                        continue;
                    }
                    if (wb2(subSentence, wordDict)) {
                        return true;
                    } else {
                        breakIndexesFails.add(subSentence);
                    }
                }
            }
        }

        return false;
    }

}
