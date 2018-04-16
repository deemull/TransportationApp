package com.company;

public class HovLane {
    private Car head;
    private HovLane next;

    public HovLane() {
        head = new Car();
        next = null;
    }

    public Car getHead() {
        return head;
    }

    public void setHead(Car head) {
        this.head = head;
    }

    public HovLane getNext() {
        return next;
    }

    public void setNext(HovLane next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "HovLane{" +
                "head=" + head +
                ", next=" + next +
                '}';
    }

    public int size() {
        HovLane lane = this.next;
        int count = 0;
        if (lane != null){
            count++;
            lane = lane.next;
        }
        return count;
    }
}
