package ru.lember.leetcode.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.lember.leetcode.ListNode;

class IntersectionOfTwoLinkedListsTest {

    @Test
    void getIntersectionNodeTest() {

        IntersectionOfTwoLinkedLists service = new IntersectionOfTwoLinkedLists();

        ListNode intersection = new ListNode(8, new ListNode(4, new ListNode(5)));

        ListNode list1 = new ListNode(4, new ListNode(1, intersection));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(1, intersection)));

        Assertions.assertEquals(intersection, service.getIntersectionNode(list1, list2));


        ///
//        intersection = new ListNode(8, new ListNode(4, new ListNode(5)));
//
//        list1 = new ListNode(4, new ListNode(1, intersection));
//        list2 = new ListNode(5, new ListNode(6, new ListNode(1, intersection)));


    }
}
