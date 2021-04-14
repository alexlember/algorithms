package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinDiffValueTest {

    @Test
    void minDiffInBST() {

        MinDiffValue service = new MinDiffValue();

        TreeNode node = new TreeNode(90);
        node.left = new TreeNode(69);
        node.left.left = new TreeNode(49);
        node.left.right = new TreeNode(89);
        node.left.left.right = new TreeNode(52);

        Assertions.assertEquals(1, service.getMinimumDifference(node));

    }

    @Test
    void minDiffInBST2() {

        MinDiffValue service = new MinDiffValue();

        TreeNode node = new TreeNode(96);
        node.left = new TreeNode(12);
        node.left.right = new TreeNode(13);
        node.left.right.right = new TreeNode(52);
        node.left.right.right.left = new TreeNode(29);

        Assertions.assertEquals(1, service.getMinimumDifference(node));

    }
}