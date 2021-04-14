package ru.lember.leetcode.tree;

import java.util.TreeSet;

public class Tree2Str {

    public String tree2str(TreeNode t) {
        return dfs(t);
    }

    private String dfs(TreeNode t) {

        if (t == null) {
            return "";
        }

        String left = dfs(t.left);
        String right = dfs(t.right);

        StringBuilder sb = new StringBuilder(t.val + "");

        if (left.isEmpty() && right.isEmpty()) {
            return sb.toString();
        }

        sb.append("(").append(left).append(")");

        if (!right.isEmpty()) {
            sb.append("(").append(right).append(")");
        }
        return sb.toString();

    }

}
