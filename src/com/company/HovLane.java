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
    public ArrayList<Integer> numOccupants(ArrayList<Integer> occupants, int occupied) {
        for (int i = 0; i < occupants.size(); i++) {
            if (head.getNumOfOccupants() == occupied) {
                occupants.add(head.getId());
            }
        }
        return occupants;
    }
    public int countCarColor(ArrayList<Integer> cars, String color) {
        int count = 0;
        for (int i = 0; i < cars.size(); i++) {
            if (head.getColor() == color) {
                count++;
            }
        }
        return count;
    }

}
