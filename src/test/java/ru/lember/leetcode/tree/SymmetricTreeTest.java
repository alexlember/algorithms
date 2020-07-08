package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SymmetricTreeTest {


    @Test
    void isSymmetricTreeTest() {

        SymmetricTree service = new SymmetricTree();

        TreeNode node31 = new TreeNode(3);
        TreeNode node41 = new TreeNode(4);
        TreeNode node21 = new TreeNode(2, node31, node41);


        TreeNode node32 = new TreeNode(3);
        TreeNode node42 = new TreeNode(4);
        TreeNode node22 = new TreeNode(2, node32, node42);


        TreeNode node1 = new TreeNode(1, node21, node22);

        Assertions.assertFalse(service.isSymmetric(node1));

        node22.right = node32;
        node22.left = node42;

        Assertions.assertTrue(service.isSymmetric(node1));

        node32.val = 6;

        Assertions.assertFalse(service.isSymmetric(node1));


        ////

        TreeNode right = new TreeNode(2);
        TreeNode root = new TreeNode(1, null, right);
        Assertions.assertFalse(service.isSymmetric(root));

    }

}
