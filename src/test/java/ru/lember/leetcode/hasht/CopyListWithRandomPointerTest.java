package ru.lember.leetcode.hasht;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.lember.leetcode.Node;

class CopyListWithRandomPointerTest {


    @Test
    void copyListTest() {

        CopyListWithRandomPointer service = new CopyListWithRandomPointer();

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.random = node.next;
        node.random = node.next;

        Node actualNode = service.copyRandomList(node);
        Assertions.assertNotEquals(node, actualNode);
        //Assertions.assertTrue(node.isEqual(actualNode));

        ////

        node = new Node(3);
        node.next = new Node(3);
        node.next.next = new Node(3);

        node.next.random = node;

        actualNode = service.copyRandomList(node);
        Assertions.assertNotEquals(node, actualNode);
        //Assertions.assertTrue(node.isEqual(actualNode));

        ////

        node = new Node(7);
        node.next = new Node(13);
        node.next.next = new Node(11);
        node.next.next.next = new Node(10);
        node.next.next.next.next = new Node(1);

        node.next.random = node;
        node.next.next.random = node.next.next.next.next;
        node.next.next.next.random = node.next.next;
        node.next.next.next.next.random = node;

        actualNode = service.copyRandomList(node);
        Assertions.assertNotEquals(node, actualNode);
        //Assertions.assertTrue(node.isEqual(actualNode));

    }

}
