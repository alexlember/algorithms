package ru.lember.leetcode.twopointers;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.lember.leetcode.ListNode;

class PalindromeLinkedListTest {


    @Test
    void isPalindromeTest() {

        PalindromeLinkedList service = new PalindromeLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        Assertions.assertFalse(service.isPalindrome(head));

        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        Assertions.assertTrue(service.isPalindrome(head));

        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        Assertions.assertTrue(service.isPalindrome(head));
    }


}
