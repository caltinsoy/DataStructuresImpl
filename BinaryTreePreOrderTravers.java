package com.caltinsoy.interviewquest;

import com.caltinsoy.ds.BinaryTree.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrderTravers {

    //recursiveSolution
    private List<Integer> preOrder(TreeNode node) { // root , left ,right
        List<Integer> list = new ArrayList<>();
        if (node == null) {
            return list;
        }
        list.add(node.value);
        list.addAll(preOrder(node.left));
        list.addAll(preOrder(node.right));

        return list;
    }

    //Iterative Solution
    private List<Integer> preOrderByStack(TreeNode treeNode) {
        List<Integer> list = new ArrayList<>();
        if (treeNode == null) {
            return list;
        }
        Stack<TreeNode> integers = new Stack<>();
        integers.push(treeNode);

        while (!integers.isEmpty()) {
            TreeNode node = integers.pop();
            list.add(node.value);
            if (node.right != null) {
                integers.push(node.right);
            }
            if (node.left != null) {
                integers.push(node.left);
            }
        }

        return list;
    }
}
