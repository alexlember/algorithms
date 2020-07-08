package ru.lember.leetcode.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.lember.leetcode.ListNode;

class RemoveNthNodeFromEndOfListTest {

    @Test
    void removeNthFromEndTest() {

        RemoveNthNodeFromEndOfList service = new RemoveNthNodeFromEndOfList();

        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        Assertions.assertEquals(expected, service.removeNthFromEnd(node, 2));

        node = new ListNode(1);
        Assertions.assertNull(service.removeNthFromEnd(node, 1));

        node = new ListNode(1, new ListNode(2));
        expected = new ListNode(1);
        Assertions.assertEquals(expected, service.removeNthFromEnd(node, 1));
    }
}
