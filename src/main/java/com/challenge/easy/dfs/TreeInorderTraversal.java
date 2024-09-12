package com.challenge.easy.dfs;

import com.challenge.easy.arrays.FindWordsContainingCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

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

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<TreeNode> stack = new ArrayList<TreeNode>();
        List<Integer> inOrderResult = new ArrayList<Integer>();
        TreeNode lastNode;
        boolean finishFlag = true;

        lastNode = root;
        if(lastNode!=null){
            stack.add(lastNode);

            while(finishFlag){
                while(lastNode.left !=null){
                    stack.add(lastNode.left);
                    lastNode.left = null;
                    lastNode = stack.get(stack.size()-1);
                }

                if(stack.size()>0){
                    inOrderResult.add(stack.get(stack.size()-1).val);
                    //System.out.println("In Order Traversal element: "+inOrderResult.get(inOrderResult.size()-1));
                }

                if(lastNode.right == null){
                    if(stack.size() > 0){
                        stack.remove(stack.size()-1);
                        if(stack.size() != 0){
                            lastNode = stack.get(stack.size()-1);
                        }
                    }else{
                        finishFlag = false;
                    }
                }else{
                    stack.remove(stack.size()-1);
                    stack.add(lastNode.right);
                    lastNode.right = null;
                    lastNode = stack.get(stack.size()-1);
                }
            }

            return inOrderResult;
        }
        return inOrderResult;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(FindWordsContainingCharacter.class.getName());

        TreeInorderTraversal treeInorderTraversal = new TreeInorderTraversal();

        //Input for example 1:
        /*TreeNode nodeThree = treeInorderTraversal.new TreeNode(3);
        TreeNode nodeTwo = treeInorderTraversal.new TreeNode(2,nodeThree,null);
        TreeNode root = treeInorderTraversal.new TreeNode(1,null, nodeTwo);
        List<Integer> inOrderResult = inorderTraversal(root);*/

        //Input for example 2:
        //List<Integer> inOrderResult = inorderTraversal(null);

        //Input for example 3:
        /*TreeNode root = treeInorderTraversal.new TreeNode(1,null,null);
        List<Integer> inOrderResult = inorderTraversal(root);*/

        //Input for extra example 4:
        TreeNode nodeEight = treeInorderTraversal.new TreeNode(8);
        TreeNode nodeSeven = treeInorderTraversal.new TreeNode(7,nodeEight,null);
        TreeNode nodeSix = treeInorderTraversal.new TreeNode(6,nodeSeven,null);
        TreeNode nodeFive = treeInorderTraversal.new TreeNode(5,nodeSix,null);
        TreeNode nodeFour = treeInorderTraversal.new TreeNode(4);
        TreeNode nodeThree = treeInorderTraversal.new TreeNode(3);
        TreeNode nodeTwo = treeInorderTraversal.new TreeNode(2,nodeThree,nodeFour);
        TreeNode root = treeInorderTraversal.new TreeNode(1,nodeTwo,nodeFive);
        List<Integer> inOrderResult = inorderTraversal(root);

        logger.info("In Order Result" + inOrderResult);
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