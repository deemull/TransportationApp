package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! ");

        Car toyota = new Car(3, 13665, "grey");
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
        ArrayList<Integer> cars = new ArrayList<Integer>();

        ArrayList<Integer> occupants = lane1.numOccupants(cars,1);
        System.out.println(occupants);

        //outputting number of cars that are red
        int colorCars = lane1.countCarColor(cars,"red");
        System.out.println(colorCars);



    }
}
