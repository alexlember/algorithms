package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class LCAofBTTest {


    @Test
    void lcaTest() {

        LCAofBT service = new LCAofBT();

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode actualResult = service.lowestCommonAncestor(root, root.left, root.right);
        Assertions.assertEquals(3, actualResult.val);

        actualResult = service.lowestCommonAncestorRecursive(root, root.left, root.right);
        Assertions.assertEquals(3, actualResult.val);

        actualResult = service.lowestCommonAncestor(root, root.left, root.left.right.right);
        Assertions.assertEquals( 5, actualResult.val);

        actualResult = service.lowestCommonAncestorRecursive(root, root.left, root.left.right.right);
        Assertions.assertEquals( 5, actualResult.val);


    }


}


