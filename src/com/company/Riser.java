package com.company;

import java.util.Stack;

public class Riser {
    private Stack<Car> carStack;
    private int numOfCars;

    public Riser () {
        carStack = new Stack<Car>();
    }

    public void push(Car car){
        numOfCars++;
        carStack.push(car);

    }

    public Car pop(){
        numOfCars--;
        return carStack.pop();
    }

    public int size() {
        if (carStack.size() == 0) {
            return 0;
        }
        return 1 + carStack.size();
    }

    @Override
    public String toString() {
        return carStack + " has " + numOfCars + " cars.";

    }
}
