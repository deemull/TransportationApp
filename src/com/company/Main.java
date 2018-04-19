package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! ");

        Car toyota = new Car(3, 13665, "red");
        Car nissan = new Car();
        HovLane lane1 = new HovLane();
        System.out.println(lane1);

        //creating linked list of cars
        HovLane lane = lane1.prepend(toyota);
        System.out.println(lane);

        //outputting the size of the list
        int listSize = lane1.size();
        System.out.println(listSize);

        //outputting cars with 1 occupant
        //System.out.println("\nbefore numOccupants():\nlane1 is " + lane1 + "\nlane is " + lane + "\n.");
        //lane1.numOccupants(lane, 1);


        // TODO Oh, no.  countCarColor() returns the wrong value for [parameters]
        System.out.println("\nbefore countCarColor():\nlane is " + lane + "\ncolor is red.");
        int colorCars = lane1.countCarColor(lane, "red");
        System.out.println("There are " + colorCars + "\nlane is " + lane + "\ncolor is red.");


        //What was the most number of cars in HOV[H]?


        //Was it ever true that HOV1 and HOV2 had [N] cars?


    }
}
