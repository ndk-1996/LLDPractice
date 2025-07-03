package com.ndk.lldpractice.datastructures;

public class BinaryTree {

    private int value;
    private BinaryTree left;
    private BinaryTree right;

    public BinaryTree(int value) {
        this.value = value;
    }

    public void addLeftNode(BinaryTree left) {
        this.left = left;
    }

    public void addRightNode(BinaryTree right) {
        this.right = right;
    }

    public static void main(String[] args) {
        BinaryTree treeRootNode = new BinaryTree(10);
        BinaryTree treeLeftNode = new BinaryTree(5);
        BinaryTree treeRightNode = new BinaryTree(20);

        treeRootNode.addLeftNode(treeLeftNode);
        treeRootNode.addRightNode(treeRightNode);
    }
}
