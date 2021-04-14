package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTtoLLTest {


    @Test
    void flatten() {

        BTtoLL service = new BTtoLL();

        TreeNode root = initIn1();
        TreeNode expected = initEx1();
        service.flatten(root);
        Assertions.assertEquals(expected, root);

        root = initIn1();
        expected = initEx1();
        service.flattenPostOrder(root);
        Assertions.assertEquals(expected, root);
    }

    private TreeNode initIn1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        return root;
    }

    private TreeNode initEx1() {
        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(2);
        expected.right.right = new TreeNode(3);
        expected.right.right.right = new TreeNode(4);
        expected.right.right.right.right = new TreeNode(5);
        expected.right.right.right.right.right = new TreeNode(6);
        return expected;
    }

    @Test
    void flatten2() {

        BTtoLL service = new BTtoLL();

        TreeNode root = initIn2();
        TreeNode expected = initEx2();
        service.flatten(root);
        Assertions.assertEquals(expected, root);

        root = initIn2();
        expected = initEx2();
        service.flattenPostOrder(root);
        Assertions.assertEquals(expected, root);
    }

    private TreeNode initIn2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        return root;
    }

    private TreeNode initEx2() {
        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(2);
        expected.right.right = new TreeNode(3);
        expected.right.right.right = new TreeNode(5);
        expected.right.right.right.right = new TreeNode(4);
        return expected;
    }
}