package com.company;

import java.util.Random;
import java.util.Stack;

public class Riser {
    private Random randCar = new Random();
    private Stack<Car> carStack;
    private int numOfCars;
    private int id;

    public Riser () {
        carStack = new Stack<Car>();
    }

    public void push(Car car){
        numOfCars++;
        carStack.push(car);

    }

    public Car pop(){
        return carStack.pop();
    }

    public int size() {
        if (carStack.size() == 0) {
            return 0;
        }
        return 1 + carStack.size();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return carStack + " has " + numOfCars + " cars.";

    }
}
