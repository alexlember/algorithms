package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class KthSmallestElembentInBSTTest {


    @Test
    void kthSmallestTest() {

        KthSmallestElembentInBST service = new KthSmallestElembentInBST();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);


        Assertions.assertEquals(1, service.kthSmallest(root, 1));
        Assertions.assertEquals(1, service.kthSmallestIterative(root, 1));


        root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);


        Assertions.assertEquals(3, service.kthSmallest(root, 3));
        Assertions.assertEquals(3, service.kthSmallestIterative(root, 3));
    }


}


