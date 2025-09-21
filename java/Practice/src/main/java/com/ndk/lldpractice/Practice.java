package com.ndk.lldpractice;

public class Practice {

    class Node {
        private int num;
        private Node next;
    }

    public static void main(String[] args) {

    }

    private void reverse(Node start) {
        Node prev = null;
        Node curr = start;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
    }
}
