package ru.lember.leetcode.tree;

import java.util.*;

public class BTtoLL {

    public void flatten(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        dfs(root, list);

        if (list.isEmpty() || list.size() == 1) {
            return;
        }

        TreeNode worker = root;
        Iterator<Integer> iterator = list.iterator();
        worker.val = iterator.next();

        while (iterator.hasNext()) {
            worker.right = new TreeNode(iterator.next());
            worker.left = null;
            worker = worker.right;
        }

    }

    public void dfs(TreeNode node, List<Integer> list) {

        if (node == null) {
            return;
        }

        list.add(node.val);

        dfs(node.left, list);
        dfs(node.right, list);
    }

    private TreeNode prev = null;

    public void flattenPostOrder(TreeNode root) {
        if (root == null)
            return;
        flattenPostOrder(root.right);
        flattenPostOrder(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }

}
