package ru.lember.leetcode.linkedlist;

import ru.lember.leetcode.ListNode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 *
 * For example, the following two linked lists:
 *
 *
 * begin to intersect at node c1.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
 * Output: Reference of the node with value = 8
 * Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
 *
 *
 * Example 2:
 *
 *
 * Input: intersectVal = 2, listA = [1,9,1,2,4], listB = [3,2,4], skipA = 3, skipB = 1
 * Output: Reference of the node with value = 2
 * Input Explanation: The intersected node's value is 2 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [1,9,1,2,4]. From the head of B, it reads as [3,2,4]. There are 3 nodes before the intersected node in A; There are 1 node before the intersected node in B.
 *
 *
 * Example 3:
 *
 *
 * Input: intersectVal = 0, listA = [2,6,4], listB = [1,5], skipA = 3, skipB = 2
 * Output: null
 * Input Explanation: From the head of A, it reads as [2,6,4]. From the head of B, it reads as [1,5]. Since the two lists do not intersect, intersectVal must be 0, while skipA and skipB can be arbitrary values.
 * Explanation: The two lists do not intersect, so return null.
 *
 *
 * Notes:
 *
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Each value on each linked list is in the range [1, 10^9].
 * Your code should preferably run in O(n) time and use only O(1) memory.
 */
public class IntersectionOfTwoLinkedLists {

//    private static final Set<List<ListNode>> NODE_SET = new HashSet<>();

    public ListNode getIntersectionNodeWithEquals(ListNode headA, ListNode headB) {

        Set<List<ListNode>> nodeSet = new HashSet<>();

        ListNode currentA = headA;
        ListNode prevA = null;
        ListNode currentB = headB;
        ListNode prevB = null;

        while (currentA != null || currentB != null) {

            boolean contains;

            if (currentA != null) {
                contains = nodeSet.add(Arrays.asList(currentA, prevA));
                if (!contains) {
                    return currentA;
                }
                prevA = currentA;
                currentA = currentA.next;
            }

            if (currentB != null) {
                contains = nodeSet.add(Arrays.asList(currentB, prevB));
                if (!contains) {
                    return currentB;
                }
                prevB = currentB;
                currentB = currentB.next;
            }

        }

        return null;
    }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        Set<ListNode> nodeSet = new HashSet<>();

        ListNode currentA = headA;
        ListNode currentB = headB;

        while (currentA != null) {
            nodeSet.add(currentA);
            currentA = currentA.next;
        }

        while (currentB != null) {
            if (!nodeSet.add(currentB)) {
                return currentB;
            }
            currentB = currentB.next;
        }


        return null;
    }

//    private ListNode checkNode(ListNode current, ListNode prev) {
//        if (current != null) {
//            boolean contains = NODE_SET.add(Arrays.asList(current, prev));
//            if (!contains) {
//                return current;
//            }
//            prev = current;
//            current = current.next;
//        }
//        return null;
//    }

}
