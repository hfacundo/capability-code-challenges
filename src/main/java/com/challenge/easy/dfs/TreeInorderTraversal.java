package com.challenge.easy.dfs;

import java.util.ArrayList;
import java.util.List;

/**
    # Binary Tree Inorder Traversal

     Given the root of a binary tree, return the inorder traversal of its nodes' values.

     Example 1:

         1
          \
           2
          /
         3

         https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg

         Input: root = [1,null,2,3]
         Output: [1,3,2]

     Example 2:
         Input: root = []
         Output: []

     Example 3:
         Input: root = [1]
         Output: [1]

     Constraints:

         * The number of nodes in the tree is in the range [0, 100].
         * -100 <= Node.val <= 100

     Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class TreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        final List<Integer> traversed = new ArrayList<>();
        if (root != null) {
            traversed.addAll(inorderTraversal(root.left));
            traversed.add(root.val);
            traversed.addAll(inorderTraversal(root.right));
        }
        return traversed;
        /*final List<Integer> traversed = new ArrayList<>();
        traversalResult(root, traversed);
        return traversed;*/
    }

    /*private static void traversalResult(TreeNode node, List<Integer> traversed) {
        if (node == null) {
            return;
        }
        traversalResult(node.left, traversed);
        traversed.add(node.val);
        traversalResult(node.right, traversed);
    }*/

    public static void main(String[] args) {

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


