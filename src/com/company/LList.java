package com.company;

public class LList {
    LList next;
    int value;

    public LList() {
        next = null;
        value = 0;
    }
    public LList(int value) {
        this.value = value;
        next = null;
    }
    public LList(int num, LList next) {
        value = num;
        this.next = next;
    }

    public LList(LList rhs) {
        value = rhs.value;
        this.next = rhs;
    }

    public LList getNext() {
        return next;
    }

    public void setNext(LList next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int count(LList head) {
        if (next == null) {
            return 0;
        }
        return 1 + count(head.next);
    }

    @Override
    public String toString() {
        return "LList{" +
                "next=" + next +
                ", value=" + value +
                '}';
    }

}
