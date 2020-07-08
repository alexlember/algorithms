package ru.lember.leetcode.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.lember.leetcode.ListNode;

class ReverseLinkedListTest {

    @Test
    void reverseLLTest() {

        ReverseLinkedList service = new ReverseLinkedList();

        ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode reversed = new ListNode(5, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(1)))));

        Assertions.assertEquals(reversed, service.reverseList(node));

        node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        Assertions.assertEquals(reversed, service.reverseListRecursively(node));

    }
}
