package ru.lember.leetcode.linkedlist;

import ru.lember.leetcode.ListNode;

/**
 * Merge two sorted linked lists and return it as a new sorted list.
 * The new list should be made by splicing together the nodes of the first two lists.
 *
 * Example:
 *
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
public class MergeSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        int fromL1 = l1.val;
        int fromL2 = l2.val;

        ListNode head;

        if (fromL1 < fromL2) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }

        ListNode current = head;

        while (l1 != null || l2 != null) {

            if (l1 != null) {
                fromL1 = l1.val;

                if (l2 == null) {
                    current.next = l1;
                    l1 = l1.next;
                    current = current.next;
                    continue;
                }
            }

            fromL2 = l2.val;

            if (l1 == null) {
                current.next = l2;
                l2 = l2.next;
                current = current.next;
                continue;
            }

            if (fromL1 < fromL2) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }

            current = current.next;
        }

        return head;
    }

    /**
     * Более короткий, но менее универсальный способ.
     */
    public ListNode mergeTwoListsShort(ListNode l1, ListNode l2) {

        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        // этот кусок нужен, чтобы не создавать новый список.
        ListNode head;

        if (l1.val < l2.val) {
            head = l1;
            l1 = l1.next;
        } else {
            head = l2;
            l2 = l2.next;
        }

        ListNode current = head;

        while (l1 != null && l2 != null) {

            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }

            current = current.next;
        }

        // эта штука будет работать только если списки одинаковой длины.
        if (l1 != null) {
            current.next = l1;
        }
        if (l2 != null) {
            current.next = l2;
        }

        return head;
    }

    public ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoListsRecursive(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsRecursive(l1, l2.next);
            return l2;
        }
    }


}
