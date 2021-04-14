package ru.lember.leetcode.tree;

/**
 * Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants. The tree s could also be considered as a subtree of itself.
 *
 * Example 1:
 * Given tree s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return true, because t has the same structure and node values with a subtree of s.
 *
 *
 * Example 2:
 * Given tree s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * Given tree t:
 *    4
 *   / \
 *  1   2
 * Return false.
 */
public class Subtree {

    public boolean isSubtree(TreeNode s, TreeNode t) {

        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null) {
            return false;
        }


        return dfs(s, t);
    }

    private boolean dfs(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }

        if (s.val == t.val) {
            boolean isSame = isSame(s, t);
            if (isSame) {
                return true;
            }
        }

        if (dfs(s.left, t)) {
            return true;
        }

        return dfs(s.right, t);

    }

    private boolean isSame(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        } else if (s == null || t == null) {
            return false;
        }

        if (s.val != t.val) {
            return false;
        }

        if (!isSame(s.left, t.left)) {
            return false;
        }

        return isSame(s.right, t.right);

    }

}
