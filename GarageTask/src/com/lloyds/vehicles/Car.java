package com.lloyds.vehicles;

public class Car extends Vehicle {
    private int numDoors;
    private boolean isConvertible;
    private double bootSize;

    public Car(String make, String colour, String fuelType, double tyreSize, int price, int numDoors, boolean isConvertible, double bootSize) {
        super(make, colour, fuelType, tyreSize, price);
        this.numDoors = numDoors;
        this.isConvertible = isConvertible;
        this.bootSize = bootSize;
    }

    @Override
    public double calculateBill() {
        double randomNum = Math.random();
        return randomNum * 1000;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    public double getBootSize() {
        return bootSize;
    }

    public void setBootSize(double bootSize) {
        this.bootSize = bootSize;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", isConvertible=" + isConvertible +
                ", bootSize=" + bootSize +
                "} " + super.toString();
    }
}
