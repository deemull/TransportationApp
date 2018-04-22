package com.company;

import java.util.ArrayList;

public class Risers {
    ArrayList<Riser> lots;

    public Risers() {
        lots = new ArrayList<Riser>();
    }

    public void addCarToRiser(Car car) {
        for (int i = 0; i < lots.size(); i++) {
            if (lots.get(i).getCars() < lots.get(i+1).getCars()) {
                lots.get(i).push(car);
            }
        }
        System.out.println(lots);
    }

    public int hasID(int id) {
        for (int i = 0; i < lots.size(); i++) {
            if (lots.get(i).getId() == id) {

            }
        }
        return id;
    }

    @Override
    public String toString() {
        return "Risers{" +
                "lots=" + lots +
                '}';
    }
}
