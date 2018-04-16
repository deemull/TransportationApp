package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! ");

        HovLane lane1 = new HovLane(3);
        System.out.println(lane1);
        lane1.size();
        System.out.println(lane1.size());
        ArrayList<Integer> occupants = lane1.numOccupants(1);
        System.out.println(occupants);
        int colorCars = lane1.countCarColor("red");
        System.out.println(colorCars);


    }
}
