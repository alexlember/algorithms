package ru.lember.leetcode.hasht;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class GroupAnagramsTest {


    @Test
    void groupAnagramsTest() {

        GroupAnagrams service = new GroupAnagrams();

        List<List<String>> grouped = service.groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"});

        Assertions.assertEquals(3, grouped.size());

    }

}
