package com.company;

import java.util.Random;
import java.util.Stack;

public class Riser {
    private Random randCar = new Random();
    private Stack<Car> carStack;
    private int cars;
    private int id;
    private static int riserId;

    public Riser () {
        carStack = new Stack<Car>();
        cars = randCar.nextInt(5) + 1;
        id = randCar.nextInt(10) + 1;
        riserId = randCar.nextInt(10) + 1;

    }

    public void push(Car car){
        cars++;
        carStack.push(car);
    }

    public Car pop(){
        cars--;
        return carStack.pop();
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

    public static int getRiserId() {
        return riserId;
    }

    public static void setRiserId(int riserId) {
        Riser.riserId = riserId;
    }

    @Override
    public String toString() {
        return "Riser{" +
                " carStack=" + carStack +
                ", cars=" + cars +
                ", id=" + id +
                '}';
    }
}
