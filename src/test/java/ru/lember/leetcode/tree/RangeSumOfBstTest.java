package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RangeSumOfBstTest {

    @Test
    void diameterOfBinaryTreeTest() {

        RangeSumOfBst service = new RangeSumOfBst();
        int sum = service.rangeSumBST(initRoot(), 7, 15);
        Assertions.assertEquals(32, sum);


    }

    private TreeNode initRoot() {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);
        return root;
    }

}
