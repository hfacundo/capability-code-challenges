package com.challenge.easy.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeInorderTraversal {

    /**
     * Recursive approach for inorder traversal of a binary tree.
     *
     * @param root The root of the binary tree.
     * @return List of integers in inorder traversal order.
     */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        recursiveInorder(root, result);
        return result;
    }

    /**
     * Helper method for recursive inorder traversal.
     */
    private void recursiveInorder(TreeNode node, List<Integer> result) {
        if (node == null) return;
        recursiveInorder(node.left, result);  // Traverse left subtree
        result.add(node.val);                // Visit node
        recursiveInorder(node.right, result); // Traverse right subtree
    }

    /**
     * Iterative approach for inorder traversal of a binary tree.
     *
     * @param root The root of the binary tree.
     * @return List of integers in inorder traversal order.
     */
    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            // Push all left nodes onto the stack
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            // Process the top node on the stack
            current = stack.pop();
            result.add(current.val);
            // Move to the right subtree
            current = current.right;
        }

        return result;
    }

    public static void main(String[] args) {
        TreeInorderTraversal traversal = new TreeInorderTraversal();
        TreeNode root = traversal.new TreeNode(1, null, traversal.new TreeNode(2, traversal.new TreeNode(3), null));

        // Recursive output
        System.out.println(traversal.inorderTraversal(root)); // Output: [1, 3, 2]

        // Iterative output
        System.out.println(traversal.inorderTraversalIterative(root)); // Output: [1, 3, 2]
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

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
