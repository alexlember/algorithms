package ru.lember.leetcode.twopointers;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.lember.leetcode.ListNode;

class LinkedListCycleTest {


    @Test
    void hasCycle() {

        LinkedListCycle service = new LinkedListCycle();

        ListNode node = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(4))));
        node.next.next.next.next = node.next;
        Assertions.assertTrue(service.hasCycle(node));

        node = new ListNode(1, new ListNode(2));
        node.next.next = node;
        Assertions.assertTrue(service.hasCycle(node));

        node = new ListNode(1);
        Assertions.assertFalse(service.hasCycle(node));

    }


}
