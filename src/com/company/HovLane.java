package com.company;

import java.util.ArrayList;

public class HovLane {
    private Car head;
    private HovLane next;

    public HovLane() {
        head = new Car();
        next = null;
    }

    public HovLane(Car head) {
        this.head = head;
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
        if (next == null) {
            return " " + head;
        }
        return head + "-->" + next;
    }

    public HovLane prepend(Car car) {
        HovLane temp = new HovLane(car);
        temp.next = this;
        return temp;
    }

    public int size() {
        if (this.next == null) {
            return 1;
        }
        return 1 + this.next.next.size();
    }

    public int numOccupants(HovLane lane, int occupied) {
        int count = 0;
        for (int i = 0; i < lane.size(); i++) {
            if (lane.getHead().getNumOfOccupants() == occupied) {
                count++;
            }
        }
        return count;
    }

    public int countCarColor(HovLane lane, String color) {
        int count = 0;
        while (lane != null) {
            if (lane.getHead().getColor() == color) {
                count++;
                lane = lane.next;
            }
        }
            return count;

    }

    public int numCarsInHov() {
        int count = 0;
        return count;
    }

    public boolean hasNCars(HovLane lane1, HovLane lane2, int numCars) {
        if (lane1.getHead() == null) {
            return false;
        }
        return true;
    }

}
