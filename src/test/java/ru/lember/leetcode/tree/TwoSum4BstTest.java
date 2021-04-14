package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSum4BstTest {

    @Test
    void test1() {

        TwoSum4Bst service = new TwoSum4Bst();

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);


        Assertions.assertTrue(service.findTarget(root, 9));


    }

    @Test
    void test2() {

        TwoSum4Bst service = new TwoSum4Bst();

        TreeNode root = new TreeNode(1);

        Assertions.assertFalse(service.findTarget(root, 2));


    }

}
