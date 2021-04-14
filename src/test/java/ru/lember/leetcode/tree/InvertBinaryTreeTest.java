package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class InvertBinaryTreeTest {

    @Test
    void invertTreeTest() {

        InvertBinaryTree service = new InvertBinaryTree();

        TreeNode expectedRoot = new TreeNode(4);
        expectedRoot.left = new TreeNode(7);
        expectedRoot.right = new TreeNode(2);
        expectedRoot.left.left = new TreeNode(9);
        expectedRoot.left.right = new TreeNode(6);
        expectedRoot.right.left = new TreeNode(3);
        expectedRoot.right.right = new TreeNode(1);

        TreeNode actualRoot = service.invertTreeBfs(initRoot());
        Assertions.assertEquals(expectedRoot, actualRoot);

        actualRoot = service.invertTreeDfs(initRoot());
        Assertions.assertEquals(expectedRoot, actualRoot);


    }

    private TreeNode initRoot() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        return root;
    }


}


