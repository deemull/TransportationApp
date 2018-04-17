package com.company;

public class Car {
    private int numOfOccupants;
    private int id;
    private String color;

    public Car() {
        numOfOccupants = 0;
        id = 0;
        color = "";
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
