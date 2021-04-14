package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtreeTest {

    @Test
    void isSubtree() {

        Subtree service = new Subtree();

        TreeNode s = new TreeNode(3);
        s.left = new TreeNode(4);
        s.right = new TreeNode(5);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(2);


        TreeNode t = new TreeNode(4);
        t.left = new TreeNode(1);
        t.right = new TreeNode(2);

        Assertions.assertTrue(service.isSubtree(s, t));

    }

    @Test
    void isSubtree2() {

        Subtree service = new Subtree();

        TreeNode s = new TreeNode(-1);
        s.left = new TreeNode(-4);
        s.right = new TreeNode(8);
        s.left.left = new TreeNode(-6);
        s.left.right = new TreeNode(-2);
        s.right.left = new TreeNode(3);
        s.right.right = new TreeNode(9);
        s.left.left.right = new TreeNode(-5);
        s.right.left.left = new TreeNode(0);
        s.right.left.right = new TreeNode(7);


        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(0);
        t.right = new TreeNode(5848);

        Assertions.assertFalse(service.isSubtree(s, t));

    }
}