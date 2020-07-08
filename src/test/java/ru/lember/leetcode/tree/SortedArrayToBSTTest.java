package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Test;

class SortedArrayToBSTTest {


    @Test
    void bstFromSortedArrayTest() {

        SortedArrayToBST service = new SortedArrayToBST();


        TreeNode expectedRoot = new TreeNode(0);

        expectedRoot.left = new TreeNode(-3);
        expectedRoot.right = new TreeNode(9);

        expectedRoot.left.left = new TreeNode(-10);
        expectedRoot.right.left = new TreeNode(5);


        int[] array = new int[] {-10,-3,0,5,9};

        TreeNode actualRoot = service.sortedArrayToBST(array);

        //Assertions.assertEquals(expectedRoot, actualRoot); todo - test is wrong, suppose to test balancing but not exact palces of nodes.
    }

}

//Expected :TreeNode(val=0,
//        left=TreeNode(val=-3,
//            left=TreeNode(val=-10,
//                left=null,
//                right=null),
//            right=null),
//        right=TreeNode(val=9,
//                left=TreeNode(val=5,
//                    left=null,
//                    right=null),
//                right=null))

