package com.challenge.easy.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pNode = root;

        while (pNode != null || !stack.isEmpty()) {
            while (pNode != null) {
                stack.push(pNode);
                pNode = pNode.left;
            }
            pNode = stack.pop();
            result.add(pNode.val);
            pNode = pNode.right;
        }
        return result;
    }

    public static void main(String[] args) {
        /*TreeInorderTraversal tree = new TreeInorderTraversal();
        TreeNode root = tree.new TreeNode(1);
        root.right = tree.new TreeNode(2);
        root.right.left = tree.new TreeNode(3);

        List<Integer> res = tree.inorderTraversal(root);
        System.out.println(res);*/
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() { }

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


