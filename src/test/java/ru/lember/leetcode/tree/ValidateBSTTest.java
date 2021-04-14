package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidateBSTTest {


    @Test
    void validateBSTTest() {

        ValidateBST service = new ValidateBST();

        TreeNode root = new TreeNode(2);

        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        Assertions.assertTrue(service.isValidBST(root));

        root = new TreeNode(5);

        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        Assertions.assertFalse(service.isValidBST(root));

    }

}
