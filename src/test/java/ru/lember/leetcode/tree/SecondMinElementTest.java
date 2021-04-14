package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondMinElementTest {

    @Test
    void findSecondMinimumValue() {

        SecondMinElement service = new SecondMinElement();


        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        Assertions.assertEquals(5, service.findSecondMinimumValue(root));

    }
}