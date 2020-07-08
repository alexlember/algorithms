package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxDepthOfBinaryTreeTest {


    @Test
    void maxDepthTest() {

        MaxDepthOfBinaryTree service = new MaxDepthOfBinaryTree();

        Assertions.assertEquals(0, service.maxDepthRecursive1(null));
        Assertions.assertEquals(0, service.maxDepthRecursive2(null));
        Assertions.assertEquals(0, service.maxDepthIterativeDFS(null));
        Assertions.assertEquals(0, service.maxDepthIterativeBFS(null));

        TreeNode root = new TreeNode(3);
        Assertions.assertEquals(1, service.maxDepthRecursive1(root));
        Assertions.assertEquals(1, service.maxDepthRecursive2(root));
        Assertions.assertEquals(1, service.maxDepthIterativeDFS(root));
        Assertions.assertEquals(1, service.maxDepthIterativeBFS(root));

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        Assertions.assertEquals(2, service.maxDepthRecursive1(root));
        Assertions.assertEquals(2, service.maxDepthRecursive2(root));
        Assertions.assertEquals(2, service.maxDepthIterativeDFS(root));
        Assertions.assertEquals(2, service.maxDepthIterativeBFS(root));

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Assertions.assertEquals(3, service.maxDepthRecursive1(root));
        Assertions.assertEquals(3, service.maxDepthRecursive2(root));
        Assertions.assertEquals(3, service.maxDepthIterativeDFS(root));
        Assertions.assertEquals(3, service.maxDepthIterativeBFS(root));

        Assertions.assertEquals(2, service.maxDepthRecursive1(root.right));
        Assertions.assertEquals(2, service.maxDepthRecursive2(root.right));
        Assertions.assertEquals(2, service.maxDepthIterativeDFS(root.right));
        Assertions.assertEquals(2, service.maxDepthIterativeBFS(root.right));


        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        Assertions.assertEquals(3, service.maxDepthRecursive1(root));
        Assertions.assertEquals(3, service.maxDepthRecursive2(root));
        Assertions.assertEquals(3, service.maxDepthIterativeDFS(root));
        Assertions.assertEquals(3, service.maxDepthIterativeBFS(root));

        root.right.left.right = new TreeNode(15);

        Assertions.assertEquals(4, service.maxDepthRecursive1(root));
        Assertions.assertEquals(4, service.maxDepthRecursive2(root));
        Assertions.assertEquals(4, service.maxDepthIterativeDFS(root));
        Assertions.assertEquals(4, service.maxDepthIterativeBFS(root));

        root.right.left.left = new TreeNode(7);
        Assertions.assertEquals(4, service.maxDepthRecursive1(root));
        Assertions.assertEquals(4, service.maxDepthRecursive2(root));
        Assertions.assertEquals(4, service.maxDepthIterativeDFS(root));
        Assertions.assertEquals(4, service.maxDepthIterativeBFS(root));

        root.right.left.left.right = new TreeNode(7);
        Assertions.assertEquals(5, service.maxDepthRecursive1(root));
        Assertions.assertEquals(5, service.maxDepthRecursive2(root));
        Assertions.assertEquals(5, service.maxDepthIterativeDFS(root));
        Assertions.assertEquals(5, service.maxDepthIterativeBFS(root));
    }

    @Test
    void bfsTest() {

        MaxDepthOfBinaryTree service = new MaxDepthOfBinaryTree();

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left.right = new TreeNode(15);
        root.right.left.left = new TreeNode(7);
        root.right.left.left.right = new TreeNode(7);

        Assertions.assertEquals(5, service.maxDepthIterativeBFS(root));

    }


    @Test
    void dfsTest() {

        MaxDepthOfBinaryTree service = new MaxDepthOfBinaryTree();

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        Assertions.assertEquals(3, service.maxDepthIterativeDFS(root));

    }
}
