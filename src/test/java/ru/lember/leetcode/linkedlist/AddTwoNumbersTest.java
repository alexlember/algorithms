package ru.lember.leetcode.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.lember.leetcode.ListNode;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbersTest() {

        AddTwoNumbers service = new AddTwoNumbers();

        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));


        Assertions.assertEquals(expected, service.addTwoNumbers(l1, l2));

        ///

        l1 = new ListNode(5);
        l2 = new ListNode(5);

        expected = new ListNode(0, new ListNode(1));


        Assertions.assertEquals(expected, service.addTwoNumbers(l1, l2));

    }
}
