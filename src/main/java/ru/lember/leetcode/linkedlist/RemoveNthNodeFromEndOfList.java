package ru.lember.leetcode.linkedlist;

import ru.lember.leetcode.ListNode;

/**
 * Medium
 *
 * Given a linked list, remove the n-th node from the end of list and return its head.
 *
 * Example:
 *
 * Given linked list: 1->2->3->4->5, and n = 2.
 *
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * Note:
 *
 * Given n will always be valid.
 *
 * Follow up:
 *
 * Could you do this in one pass?
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {


        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;

        int counter = 0;

        while (fast != null) {

            if (counter > n) {
                slow = slow.next;
            }

            fast = fast.next;
            counter++;
        }

        // found node to delete (slow).
        slow.next = slow.next.next;

        return dummy.next;
    }

}
