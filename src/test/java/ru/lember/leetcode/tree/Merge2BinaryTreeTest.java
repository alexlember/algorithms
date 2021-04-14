package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Merge2BinaryTreeTest {


    @Test
    void mergeTreesTest() {

        Merge2BinaryTree service = new Merge2BinaryTree();

        TreeNode first = new TreeNode(1);
        first.left = new TreeNode(3);
        first.right = new TreeNode(2);
        first.left.left = new TreeNode(5);

        TreeNode second = new TreeNode(2);
        second.left = new TreeNode(1);
        second.right = new TreeNode(3);
        second.left.right = new TreeNode(4);
        second.right.right = new TreeNode(7);

        TreeNode expectedRoot = new TreeNode(3);
        expectedRoot.left = new TreeNode(4);
        expectedRoot.right = new TreeNode(5);
        expectedRoot.left.left = new TreeNode(5);
        expectedRoot.left.right = new TreeNode(4);
        expectedRoot.right.right = new TreeNode(7);

        TreeNode actualRoot = service.mergeTrees(first, second);

        Assertions.assertEquals(expectedRoot, actualRoot);

    }


}


