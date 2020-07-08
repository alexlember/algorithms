package ru.lember.leetcode.linkedlist;

import ru.lember.leetcode.ListNode;

/**
 * Medium
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example:
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode current1 = l1;
        ListNode current2 = l2;

        ListNode previousNode = null;
        ListNode head = previousNode;

        int sum = 0;
        while (current1 != null || current2 != null) {

            if (current1 != null) {
                sum += current1.val;
            }

            if (current2 != null) {
                sum += current2.val;
            }


            boolean overflow = sum >= 10;
            int currentDigit = overflow ? Math.abs(10 - sum) : sum;

            sum = overflow ? 1 : 0;

            ListNode currentNode = new ListNode(currentDigit);
            if (previousNode != null) {
                previousNode.next = currentNode;
            } else {
                head = currentNode;
            }

            previousNode = currentNode;

            if (current1 != null) {
                current1 = current1.next;
            }

            if (current2 != null) {
                current2 = current2.next;
            }

        }

        if (sum == 1) {
            previousNode.next = new ListNode(1);
        }

        return head;
    }

}
