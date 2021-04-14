package ru.lember.leetcode.tree;

import java.util.Optional;
import java.util.TreeSet;

public class SecondMinElement {

    private int min = Integer.MAX_VALUE;

    private final TreeSet<Integer> set = new TreeSet<>();

    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);

        Integer higher = set.higher(min);

        return Optional.ofNullable(higher).orElse(-1);
    }

    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }

        int val = node.val;

        if (val < min) {
            min = val;
        }

        set.add(val);

        dfs(node.left);
        dfs(node.right);

    }

}
