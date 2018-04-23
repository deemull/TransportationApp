package com.company;

import java.util.ArrayList;

public class Risers {
    ArrayList<Riser> lots;

    public Risers(int num) {
        lots = new ArrayList<Riser>();
        for (int i = 0; i < num; i++) {
            lots.add(new Riser());
        }
    }
    public int size() {
        return lots.size();
    }
    public void add() {
        for (int i = 0; i < lots.size(); i++) {
            lots.get(i).push(new Car());
        }
    }
    public void addCarToRiser() {
        for (int i = 1; i < lots.size(); i++) {
            if (lots.get(i).size() <= lots.get(i+1).size()) {
                lots.get(i).push(new Car());
            }
        }
        System.out.println(lots);
    }

    public int moveCars(Car car) {
        int count = 0;
        for (int i = 0; i < lots.size(); i++) {
            while (lots.get(i) != lots.get(i+1)) {
                count++;
            }
        }
        return count;
    }
    @Override
    public String toString() {
        return '{' + "lots=" + lots + '}';
    }
}
