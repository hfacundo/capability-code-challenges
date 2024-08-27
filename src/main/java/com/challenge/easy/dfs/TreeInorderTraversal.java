package com.challenge.easy.dfs;

import java.util.*;

/**
 * # Binary Tree Inorder Traversal
 * <p>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 * <p>
 * Example 1:
 * <p>
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * https://assets.leetcode.com/uploads/2020/09/15/inorder_1.jpg
 * <p>
 * Input: root = [1,null,2,3]
 * Output: [1,3,2]
 * <p>
 * Example 2:
 * Input: root = []
 * Output: []
 * <p>
 * Example 3:
 * Input: root = [1]
 * Output: [1]
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 100].
 * -100 <= Node.val <= 100
 * <p>
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */
public class TreeInorderTraversal {

    // In order traversal with iterative way
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        // While stack won't be null or current node won't be null
        while (!stack.empty() || currentNode != null) {
            while (currentNode != null) {
                // If current node isn't null, it will be added to stack
                stack.push(currentNode);
                // Set current node point to left node
                currentNode = currentNode.left;
            }
            // Set current node point to pop last node entered to stack
            currentNode = stack.pop();
            // Add current node value to result list
            result.add(currentNode.val);
            // Set current node point to right node
            currentNode = currentNode.right;
        }
        return result;
    }

    // In order traversal with recursion method, but with the class trick
    public List<Integer> inorderTraversalR(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        // Create a class to apply recursion with a method -> Class trick
        class Traverse {
            // Create constructor when current node is needed
            Traverse(TreeNode currentNode) {
                if (currentNode.left != null) {
                    // If the current left node is not null, it will be adding left node of current to stack,
                    // this stack isn't implicit
                    new Traverse(currentNode.left);
                }
                // When current node hasn't children, it will be adding to the array list
                result.add(currentNode.val);
                if (currentNode.right != null) {
                    // If the current right node is not null, it will be adding right node of current to stack,
                    // this stack isn't implicit
                    new Traverse(currentNode.right);
                }
            }
        }
        new Traverse(root);
        return result;
    }

    public static void main(String[] args) {
        TreeInorderTraversal tree = new TreeInorderTraversal();
        TreeInorderTraversal.TreeNode root = tree.new TreeNode(1);
        root.right = tree.new TreeNode(2);
        root.right.left = tree.new TreeNode(3);
        System.out.println(tree.inorderTraversal(root));
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


