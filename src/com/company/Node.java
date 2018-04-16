package com.company;

public class Node {
    Node next;
    int value;

    public Node() {
        next = null;
        value = 0;
    }
    public Node(int value) {
        this.value = value;
        next = null;
    }
    public Node(int num, Node next) {
        value = num;
        this.next = next;
    }

    public Node(Node rhs) {
        value = rhs.value;
        this.next = rhs;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int count(Node head) {
        if (next == null) {
            return 0;
        }
        return 1 + count(head.next);
    }

    @Override
    public String toString() {
        return "Node{" +
                "next=" + next +
                ", value=" + value +
                '}';
    }

}
