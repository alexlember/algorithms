package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BalancedTreeTest {

    @Test
    public void test() {
        BalancedTree service = new BalancedTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);

        Assertions.assertFalse(service.isBalanced(root));


    }

}
