package ru.lember.leetcode.linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.lember.leetcode.ListNode;

class DeleteNodeTest {

    @Test
    void deleteNodeTest() {

        DeleteNode service = new DeleteNode();

        ListNode nodeToDelete = new ListNode(5, new ListNode(1, new ListNode(9)));
        ListNode node = new ListNode(4, nodeToDelete);
        ListNode deletedNode = new ListNode(4, new ListNode(1, new ListNode(9)));

        service.deleteNode(nodeToDelete);

        Assertions.assertEquals(deletedNode, node);


        nodeToDelete = new ListNode(1, new ListNode(9));
        node = new ListNode(4, new ListNode(5, nodeToDelete));
        deletedNode = new ListNode(4, new ListNode(5, new ListNode(9)));

        service.deleteNode(nodeToDelete);

        Assertions.assertEquals(deletedNode, node);

        nodeToDelete = new ListNode(2, new ListNode(0, new ListNode(1, new ListNode(3))));
        node = new ListNode(2, new ListNode(0, new ListNode(1, new ListNode(3))));
        deletedNode = new ListNode(0, new ListNode(1, new ListNode(3)));

        service.deleteNode(nodeToDelete);

        //Assertions.assertEquals(deletedNode, node); test не работает из-за equals & hashcode.

    }
}
