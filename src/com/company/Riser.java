package com.company;

import java.util.Random;
import java.util.Stack;

public class Riser {
    private Random randCar = new Random();
    private Stack<Car> carStack;
    private Car car;
    private int cars;
    private int id;

    public Riser () {
        carStack = new Stack<Car>();
        cars = randCar.nextInt(5) + 1;
        car = new Car(randCar.nextInt(5) + 1, randCar.nextInt(100) + 1, "grey");

    }

    public void push(Car car){
        for (int i = 0; i < cars; i++) {
            carStack.push(car);
        }
    }

    public Car pop(){
        return carStack.pop();
    }

    public int size() {
        return carStack.size();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Riser{" + ", carStack=" + carStack + ", cars=" + cars + '}';
    }
}
