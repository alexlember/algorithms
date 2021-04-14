package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiameterOfBinaryTreeTest {

    @Test
    void diameterOfBinaryTreeTest() {

        DiameterOfBinaryTree service = new DiameterOfBinaryTree();
        int diameter = service.diameterOfBinaryTree(initRoot());
        Assertions.assertEquals(3, diameter);

        diameter = service.diameterOfBinaryTree(initRoot2());
        Assertions.assertEquals(7, diameter);

    }

    private TreeNode initRoot() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        return root;
    }

    private TreeNode initRoot2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(7);
        root.left.right.right.right = new TreeNode(8);
        root.left.left.left = new TreeNode(9);
        root.left.left.left.left = new TreeNode(10);
        root.left.left.left.left.left = new TreeNode(11);
        return root;
    }

}
