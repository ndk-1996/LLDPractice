package com.ndk.lldpractice.datastructures;

public class LinkedList {

    private static class Node {
        private int value;
        private Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node start;
    private Node end;

    public Node add(int value) {
        Node node = new Node(value, null);
        // if start is null, end must also be null.
        if (start == null) {
            start = node;
            end = node;
        } else {
            end.next = node;
            end = node;
        }

        return node;
    }

    public void remove(Node node) {
        Node curr = start;
        Node prev = null;
        while (curr != null) {
            if (curr.value == node.value) {
                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    start = curr.next;
                }
                curr.next = null;
                break;
            }
            prev = curr;
            curr = curr.next;
        }
    }

    public void reverse() {
        Node curr = start;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node temp = start;
        start = end;
        end = temp;
    }

    public void iterate() {
        Node curr = start;
        while (curr != null) {
            if (curr.next == null) {
                System.out.println(curr.value);
            } else {
                System.out.print(curr.value + "->");
            }
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Node node1 = linkedList.add(1);
        Node node2 = linkedList.add(2);
        Node node3 = linkedList.add(3);
        Node node4 = linkedList.add(4);
        Node node5 = linkedList.add(5);
        linkedList.iterate();

        linkedList.remove(node5);
        linkedList.iterate();
    }
}
