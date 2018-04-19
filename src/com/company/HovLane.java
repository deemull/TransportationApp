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
        next = this.getNext();
    }
    public HovLane(int size) {
        head = new Car();
        next = null;
        if (size > 1) {
            next = new HovLane(size - 1);
        }
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
        return 1 + this.next.size();
    }

    public ArrayList<Integer> numOccupants(HovLane lane, int occupied) {
        ArrayList<Integer> occupants = new ArrayList<Integer>();
        while (lane != null) {
            if (lane.getHead().getNumOfOccupants() == occupied) {
                occupants.add(lane.getHead().getId());
            }
            lane = lane.next;
        }

        return occupants;
    }

    public int countCarColor(HovLane lane, String color) {
        int count = 0;
        while (lane != null) {
            if (lane.getHead().getColor() == color) {
                count++;

            }
            lane = lane.next;
        }
            return count;

    }

    public HovLane split(HovLane lane1, HovLane lane2, int splitNum) {
        HovLane temp = lane1.next.next;
        HovLane temp2 = temp.next;
        temp.next = null;
        return temp2;
    }


    public void isGreater(HovLane lane1, HovLane lane2, int numCars) {
        if (lane1.size() > numCars && lane2.size() > numCars) {
            System.out.println("true ");
        }
        System.out.println();
    }


}
