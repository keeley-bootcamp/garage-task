package com.lloyds.vehicles;

public abstract class Vehicle {
    private String make;
    private String colour;
    private String fuelType;
    private double tyreSize;
    private int price;
    public abstract double calculateBill();

    public Vehicle(String make, String colour, String fuelType, double tyreSize, int price) {
        this.make = make;
        this.colour = colour;
        this.fuelType = fuelType;
        this.tyreSize = tyreSize;
        this.price = price;
    }

    public Vehicle(){}

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(double tyreSize) {
        this.tyreSize = tyreSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", tyreSize=" + tyreSize +
                ", price=" + price +
                '}';
    }
}
