package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TreeNodeTest {

    @Test
    void equalsTest() {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);


        TreeNode root2 = new TreeNode(3);

        root2.left = new TreeNode(9);
        root2.right = new TreeNode(20);

        root2.right.left = new TreeNode(15);
        root2.right.right = new TreeNode(7);
        root2.left.left = new TreeNode(2);
        root2.left.right = new TreeNode(4);

        Assertions.assertEquals(root, root2);
        Assertions.assertEquals(root.left, root2.left);
        Assertions.assertEquals(root.right, root2.right);
        Assertions.assertEquals(root.right.right, root2.right.right);
        Assertions.assertEquals(root.right.left, root2.right.left);
        Assertions.assertEquals(root.left.left, root2.left.left);
        Assertions.assertEquals(root.left.right, root2.left.right);
        Assertions.assertNotEquals(root, null);
        Assertions.assertNotEquals(root, root2.right);
        Assertions.assertNotEquals(root.left, root2);

        root2.left.right = new TreeNode(5);
        Assertions.assertNotEquals(root, root2);
    }

}
