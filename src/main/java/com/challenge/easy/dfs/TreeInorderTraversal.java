package com.challenge.easy.dfs;

import org.w3c.dom.Node;

import java.lang.reflect.Array;
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
        List<Integer> result = new ArrayList<Integer>();

        Stack<TreeNode> stack = new Stack<>();

        TreeNode currentNode = root;

        while (currentNode != null || !stack.isEmpty()){

            // We go to the deepest left node
            while (currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }

            // Retrieve the last element inserted in the stack
            currentNode = stack.pop();
            result.add(currentNode.val);

            // We get the right node, if its null the program skips to the next node in the stack in the following loop instance
            currentNode = currentNode.right;

        }

        return  result;

    }

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


