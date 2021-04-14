package ru.lember.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

public class Cousins {

    private final Map<Integer, String> map = new HashMap<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, Integer.MAX_VALUE, 0, x, y);
        String xInfo = map.get(x);
        String yInfo = map.get(y);

        if (xInfo == null || yInfo == null) {
            return false;
        }

        String[] xInfoSplitted = xInfo.split("/");
        String[] yInfoSplitted = yInfo.split("/");

        return xInfoSplitted[0].equals(yInfoSplitted[0])
                && !xInfoSplitted[1].equals(yInfoSplitted[1]);

    }

    private void dfs(TreeNode node, int parentVal, int currentDepth, int x, int y) {

        if (node == null) {
            return;
        }

        if (node.val == x) {
            map.put(x, currentDepth + "/" + parentVal);
            return;
        }

        if (node.val == y) {
            map.put(y, currentDepth + "/" + parentVal);
            return;
        }

        dfs(node.left, node.val, ++currentDepth, x, y);
        dfs(node.right, node.val, currentDepth, x, y);


    }

}
