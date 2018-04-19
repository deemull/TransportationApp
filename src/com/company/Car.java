package com.company;

import java.util.Random;

public class Car {
    private Random rand = new Random();
    private int numOfOccupants;
    private int id;
    private String color;

    public Car() {
        numOfOccupants = rand.nextInt(5) + 1;
        id = rand.nextInt(100) + 1;
        color = "red";
    }
    public Car(int numOfOccupants, int id, String color) {
        this.numOfOccupants = numOfOccupants;
        this.id = id;
        this.color = color;
    }

    public int getNumOfOccupants() {
        return numOfOccupants;
    }

    public void setNumOfOccupants(int numOfOccupants) {
        this.numOfOccupants = numOfOccupants;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" + numOfOccupants + " " + id + " " +  color+ '\'' +
                '}';
    }
}
