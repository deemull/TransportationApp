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
            if (lots.get(i).size() == 0) {
                lots.get(i).push(new Car());
            }
        }
    }
    public void addCarToRiser() {
        for (int i = 0; i < lots.size(); i++) {
            if (lots.get(i).size() < lots.get(i+1).size()) {
                lots.get(i).push(new Car());
            }
        }
        System.out.println(lots);
    }

//    public int hasID(int id) {
//        for (int i = 0; i < lots.size(); i++) {
//            if (lots.get(i)() == id) {
//
//            }
//        }
//        return id;
//    }

    public int moveCars() {
        int count = 0;
        return count;
    }
    @Override
    public String toString() {
        return '{' + "lots=" + lots + '}';
    }
}
