package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Tree2StrTest {

    @Test
    void tree2str() {

        Tree2Str service = new Tree2Str();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);

        Assertions.assertEquals("1(2(4))(3)", service.tree2str(root));
    }

    @Test
    void tree2str2() {

        Tree2Str service = new Tree2Str();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(3);

        Assertions.assertEquals("1(2()(4))(3)", service.tree2str(root));
    }
}