package ru.lember.leetcode.tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class InorderTraversalTest {


    @Test
    void inorderTraversalTest() {

        InorderTraversal service = new InorderTraversal();

        TreeNode node32 = new TreeNode(3);
        TreeNode node22 = new TreeNode(2, node32, null);


        TreeNode node1 = new TreeNode(1, null, node22);

        List<Integer> result = service.inorderTraversalIterative(node1);

        List<Integer> expected = Stream.of(1, 3, 2).collect(Collectors.toList());

        Assertions.assertEquals(expected, result);

        result = service.inorderTraversalRecursive(node1);
        Assertions.assertEquals(expected, result);

        ///

        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);


        TreeNode root = new TreeNode(3, left, right);

        result = service.inorderTraversalRecursive(root);

        expected = Stream.of(1, 3, 2).collect(Collectors.toList());
        Assertions.assertEquals(expected, result);
    }

}
