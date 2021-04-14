package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lca2Test {

    @Test
    void lowestCommonAncestor() {

        Lca2 service = new Lca2();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2); //
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8); //
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        Assertions.assertEquals(6, service.lowestCommonAncestor(root, root.left, root.right).val);

    }

    @Test
    void lowestCommonAncestor2() {

        Lca2 service = new Lca2();
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2); //
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = new TreeNode(8); //
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        Assertions.assertEquals(2, service.lowestCommonAncestor(root, root.left, root.left.right).val);

    }
}