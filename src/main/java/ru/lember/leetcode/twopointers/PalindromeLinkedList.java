package ru.lember.leetcode.twopointers;

import ru.lember.leetcode.ListNode;

/**
 * Given a singly linked list, determine if it is a palindrome.
 *
 * Example 1:
 *
 * Input: 1->2
 * Output: false
 * Example 2:
 *
 * Input: 1->2->2->1
 * Output: true
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 */
public class PalindromeLinkedList {

    boolean isPalindrome(ListNode head) {

        if (head == null) {
            return true;
        }

        if (head.next == null) {
            return true;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reversedSecondHalf = reverse(slow);

        if (reversedSecondHalf == null) {
            return false;
        }

        while (reversedSecondHalf != null && head != null) {
            if (reversedSecondHalf.val != head.val) {
                return false;
            }

            reversedSecondHalf = reversedSecondHalf.next;
            head = head.next;

        }

        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        return prev;

    }

}
