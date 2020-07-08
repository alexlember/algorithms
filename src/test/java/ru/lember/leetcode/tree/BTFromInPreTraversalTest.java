package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BTFromInPreTraversalTest {


    @Test
    void btFromInPreTest() {

        BTFromInPreTraversal service = new BTFromInPreTraversal();

        int[] preorder = new int[] {3,9,20,15,7};
        int[] inorder = new int[] {9,3,15,20,7};


        TreeNode expectedRoot = new TreeNode(3);
        expectedRoot.left = new TreeNode(9);
        expectedRoot.right = new TreeNode(20);
        expectedRoot.right.left = new TreeNode(15);
        expectedRoot.right.right = new TreeNode(7);

        TreeNode actualRoot = service.buildTree(preorder, inorder);

        Assertions.assertEquals(expectedRoot, actualRoot);

    }


}


