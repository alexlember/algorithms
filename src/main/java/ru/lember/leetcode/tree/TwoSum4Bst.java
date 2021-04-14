package ru.lember.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Given the root of a Binary Search Tree and a target number k,
 * return true if there exist two elements in the BST such that their sum is equal to the given target.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [5,3,6,2,4,null,7], k = 9
 * Output: true
 * Example 2:
 *
 *
 * Input: root = [5,3,6,2,4,null,7], k = 28
 * Output: false
 * Example 3:
 *
 * Input: root = [2,1,3], k = 4
 * Output: true
 * Example 4:
 *
 * Input: root = [2,1,3], k = 1
 * Output: false
 * Example 5:
 *
 * Input: root = [2,1,3], k = 3
 * Output: true
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [1, 104].
 * -104 <= Node.val <= 104
 * root is guaranteed to be a valid binary search tree.
 * -105 <= k <= 105
 */
public class TwoSum4Bst {

    public boolean findTarget(TreeNode root, int k) {

        Map<Integer, TreeNode> map = new HashMap<>();
        fillMap(root, map);
        return dfs(root, k, map);
    }

    // задача так же решается с 2 указателями от начала и от конца списка.
    private boolean dfs(TreeNode node, final int K, Map<Integer, TreeNode> map) {

        if (node == null) {
            return false;
        }

        TreeNode cached = map.get(K - node.val);
        if (cached != null && cached != node) {
            return true;
        }

        if (dfs(node.left, K, map)) {
            return true;
        }

        return dfs(node.right, K, map);
    }


    private void fillMap(TreeNode node, Map<Integer, TreeNode> map) {

        if (node == null) {
            return;
        }

        map.put(node.val, node);

        fillMap(node.left, map);
        fillMap(node.right, map);
    }

}
