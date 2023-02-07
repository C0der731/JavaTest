package com.java.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeTraversal1 {

    /**
     * 二叉树节点定义
     */
    private static class TreeNode {
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        TreeNode(int data) {
            this.data = data;
        }
    }
    /**
     * 构建二叉树
     * @param inputList   输入序列
     */
    public static TreeNode createBinaryTree(LinkedList<Integer> inputList){
        TreeNode node = null;

        if(inputList==null || inputList.isEmpty()){
            return null;
        }
        Integer data = inputList.removeFirst();
        //这里的判空很关键。如果元素是空，说明该节点不存在，跳出这一层递归；如果元素非空，继续递归构建该节点的左右孩子。
        if(data != null){
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(inputList);
            node.rightChild = createBinaryTree(inputList);
        }
        return node;
    }

    /**
     * 二叉树前序遍历
     * @param node   二叉树节点
     */
    public static void preOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        System.out.println(node.data);
        preOrderTraversal(node.leftChild);
        preOrderTraversal(node.rightChild);
    }

    /**
     * 二叉树中序遍历
     * @param node   二叉树节点
     */
    public static void inOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        inOrderTraversal(node.leftChild);
        System.out.println(node.data);
        inOrderTraversal(node.rightChild);
    }


    /**
     * 二叉树后序遍历
     * @param node   二叉树节点
     */
    public static void postOrderTraversal(TreeNode node){
        if(node == null){
            return;
        }
        postOrderTraversal(node.leftChild);
        postOrderTraversal(node.rightChild);
        System.out.println(node.data);
    }

    /**
     * 非递归先序遍历
     * @param root 根节点
     */
    public static void preOrderTraveralWithStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode = root;
        while (treeNode != null || !stack.isEmpty()) {
            while (treeNode != null) {
                System.out.println(treeNode.data);
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }

            if (!stack.isEmpty()) {
                treeNode = stack.pop();
                treeNode = treeNode.rightChild;
            }
        }
    }

    /**
     * 非递归中序遍历
     * @param root
     */
    public static void inOrderTraversalWithStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode = root;
        while(treeNode != null || !stack.isEmpty()){
            while (treeNode != null){
              //System.out.println(treeNode.data);  //先序
                stack.push(treeNode);
                treeNode = treeNode.leftChild;
            }
            
            if(!stack.isEmpty()){
                treeNode = stack.pop();
                System.out.println(treeNode.data);  //中序
                treeNode = treeNode.rightChild; 
            }
        }
            
    }

    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //TreeNode treeNode = root;
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.data);
            if(node.leftChild != null){
                queue.offer(node.leftChild);
            }
            if(node.rightChild != null){
                queue.offer(node.rightChild);
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(3,2,9,null,null,10,null,null,8,null,4));
        TreeNode treeNode = createBinaryTree(inputList);
        //System.out.println("前序遍历：");
        //preOrderTraversal(treeNode);
        //System.out.println("中序遍历：");
        //inOrderTraversal(treeNode);
        //System.out.println("后序遍历：");
        //postOrderTraversal(treeNode);
        //preOrderTraveralWithStack(treeNode);
        //inOrderTraversalWithStack(treeNode);
        System.out.println("层序遍历");
        levelOrderTraversal(treeNode);
    }
}
