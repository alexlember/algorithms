package ru.lember.leetcode.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.lember.leetcode.ListNode;

class MergeSortedListsTest {

    @Test
    void mergeSortedListsTest() {

        MergeSortedLists service = new MergeSortedLists();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode merged = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        Assertions.assertEquals(merged, service.mergeTwoListsShort(list1, list2));

    }
}
