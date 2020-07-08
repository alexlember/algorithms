package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class BTZigzagLevelTraversalTest {


    @Test
    void zigzagLevelOrder() {

        BTZigzagLevelTraversal service = new BTZigzagLevelTraversal();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<Integer> expectedLevel1 = Collections.singletonList(3);
        List<Integer> expectedLevel2 = Arrays.asList(20, 9);
        List<Integer> expectedLevel3 = Arrays.asList(15, 7);
        List<List<Integer>> expectedResult = Arrays.asList(
                expectedLevel1,
                expectedLevel2,
                expectedLevel3
        );

        List<List<Integer>> result = service.zigzagLevelOrder(root);

        Assertions.assertEquals(expectedResult, result);

    }


}


