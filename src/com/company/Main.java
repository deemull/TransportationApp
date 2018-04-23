package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! ");

        Car toyota = new Car(3, 13665, "red");

        //create an HovLane of cars.
        HovLane lane1 = new HovLane(10);
        System.out.println(lane1);

        //creating linked list of cars
        HovLane lane = lane1.prepend(toyota);
        System.out.println(lane);

        //outputting the size of the list
        int listSize = lane1.size();
        System.out.println("size: " + listSize);

        //outputting cars with 1 occupant
        System.out.println("\nbefore numOccupants():\nlane1 is " + lane1 + "\n.");
        ArrayList<Integer> occupants = lane1.numOccupants(lane, 1);
        System.out.println("Id: " + occupants + " for car with 1 occupant\n" );


        System.out.println("\nbefore countCarColor():\nlane is " + lane1 + "\ncolor is red.");
        int colorCars = lane1.countCarColor(lane, "red");
        System.out.println("There are " + colorCars + "\nlane is " + lane1 + "\ncolor is red.\n");


        // split HovLane into 2
        HovLane lane2 = lane1.split(lane1, lane, 3);
        System.out.println("lane1: " + lane1);
        System.out.println("lane2: " + lane2);

        //What was the most number of cars in HOV[H]?
        System.out.println("Size of Hov1: " + lane1.size());
        System.out.println("Size of Hov2: " + lane2.size());

        //Was it ever true that HOV1 and HOV2 had [N] cars?
        lane1.isGreater(lane1, lane2, 2);

        //outputting a riser
        Riser r = new Riser();
        System.out.println("r (at construction) is " + r);

        //pushing a car to the riser
        r.push(new Car());
        System.out.println(r);

        //How many cars are in Riser[R]?
        //int numCars = lot1.getCars();
        //System.out.println(numCars);

        r.push(new Car(3, 13665, "red"));
        System.out.println("r (after push 13665) is " + r);

        r.push(new Car(1, 222, "blue"));
        System.out.println("r (after push 222) is " + r);

        /*Creating list of risers
        Risers lots = new Risers(3);
        System.out.println(lots);

        //size of risers
        int size = lots.size();
        System.out.println(size);


        //The valet drives the car to the riser with the fewest cars, parks in the car elevator, and that car
        // (and every car above it) is automatically lifted one floor.
        lots.addCarToRiser();
        System.out.println(lots);
        */

    }
}
