package com.ndk.lldpractice.datastructures;

public class DoublyLinkedList {

    private class Node {
        private Node left;
        private int value;
        private Node right;

        public Node(Node left, int value, Node right) {
            this.left = left;
            this.value = value;
            this.right = right;
        }
    }

    private Node start;
    private Node end;
    private int size = 0;

    public void add(Node node) {
        if (size == 0) {
            start = node;
        } else {
            end.right = node;
            node.left = end;
        }
        end = node;
        size++;
    }

    public void remove(Node node) {
        Node leftNode = node.left;
        Node rightNode = node.right;

        if (leftNode != null) {
            leftNode.right = rightNode;
        }
        if (rightNode != null) {
            rightNode.left = leftNode;
        }

        if (node == start) {
            start = rightNode;
        } else if (node == end) {
            end = leftNode;
        }

        node.left = null;
        node.right = null;
    }

    public void iterate() {
        Node node = start;
        while (node.right != null) {
            System.out.print(node.value + "->");
            node = node.right;
        }
        System.out.println(node.value);
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        Node node = doublyLinkedList.new Node(null, 1, null);
        Node nodeToDelete = node;
        doublyLinkedList.add(node);
        doublyLinkedList.iterate();

        node = doublyLinkedList.new Node(null, 2, null);
        doublyLinkedList.add(node);
        doublyLinkedList.iterate();

        node = doublyLinkedList.new Node(null, 3, null);
        doublyLinkedList.add(node);
        doublyLinkedList.iterate();

        node = doublyLinkedList.new Node(null, 4, null);
        doublyLinkedList.add(node);
        doublyLinkedList.iterate();

        node = doublyLinkedList.new Node(null, 5, null);
        doublyLinkedList.add(node);
        doublyLinkedList.iterate();

        doublyLinkedList.remove(nodeToDelete);
        doublyLinkedList.iterate();
    }
}
