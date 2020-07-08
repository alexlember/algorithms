package ru.lember.leetcode.tree;

/**
 * Given preorder and inorder traversal of a tree, construct the binary tree.
 *
 * Note:
 * You may assume that duplicates do not exist in the tree.
 *
 * For example, given
 *
 * preorder = [3,9,20,15,7]
 * inorder = [9,3,15,20,7]
 * Return the following binary tree:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 */
public class BTFromInPreTraversal {


    public static void main(String... args) {

    }

    TreeNode buildTree(int[] preorder, int[] inorder) {

        return helper(0, preorder.length - 1, 0, inorder.length - 1, preorder, inorder);

    }

    private TreeNode helper(int preStart, int preFinish, int inStart, int inFinish, int[] preorder, int[] inorder) {


        if (preStart > preFinish || inStart > inFinish) {
            return null;
        }


        TreeNode root = new TreeNode(preorder[preStart]);

        int rootIndexInorder = 0;

        for (int i = inStart; i <= inFinish; i++) {
            if (root.val == inorder[i]) {
                rootIndexInorder = i;
                break;
            }
        }

        // so we found root in inorder, now we know that [0, rootIndexInorder - 1] - left subtree,
        // [0, rootIndexInorder + 1] - right subtree.

        int leftTreeLength = rootIndexInorder - inStart;
        root.left = helper(preStart + 1, preFinish + leftTreeLength, inStart, rootIndexInorder - 1, preorder, inorder);
        root.right = helper(preStart + 1 + leftTreeLength, preFinish,rootIndexInorder + 1, inFinish, preorder, inorder);

        return root;
    }


}


