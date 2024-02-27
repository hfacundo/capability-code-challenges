package com.challenge.easy.dfs;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TreeInorderTraversalTest {

    @Test
    void inorderTraversalTest1() {
        TreeInorderTraversal tree = new TreeInorderTraversal();
        TreeInorderTraversal.TreeNode root = tree.new TreeNode(1);
        root.right = tree.new TreeNode(2);
        root.right.left = tree.new TreeNode(3);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(2);

        Assert.assertEquals(expected, tree.inorderTraversal(root));
    }

    @Test
    void inorderTraversalTest2() {
        TreeInorderTraversal tree = new TreeInorderTraversal();
        TreeInorderTraversal.TreeNode root = null;

        List<Integer> expected = new ArrayList<>();

        Assert.assertEquals(expected, tree.inorderTraversal(root));
    }

    @Test
    void inorderTraversalTest3() {
        TreeInorderTraversal tree = new TreeInorderTraversal();
        TreeInorderTraversal.TreeNode root = tree.new TreeNode(1);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);

        Assert.assertEquals(expected, tree.inorderTraversal(root));
    }
}
