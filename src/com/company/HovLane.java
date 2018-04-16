package com.company;

import java.util.ArrayList;

public class HovLane {
    private Car head;
    private HovLane next;

    public HovLane(int numCars) {
        head = new Car();
        if (numCars != 0)
        next = new HovLane(numCars - 1);
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
        if (next == null) {
            return " " + head;
        }
        return head + "-->" + next;
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
    public ArrayList<Integer> numOccupants(int occupied) {
        ArrayList<Integer> occupants = new ArrayList<Integer>();
        if (head.getId() == occupied) {
            occupants.add(head.getId());
        }
        return occupants;
    }
    public int countCarColor(String color) {
        int count = 0;
        if (head.getColor() == color) {
            count++;
        }
        return count;
    }

}
