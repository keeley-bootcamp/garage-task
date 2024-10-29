package com.lloyds.vehicles;

public class Bus extends Vehicle {
    private int passengerCapacity;
    private int seats;
    private int numOperators;

    public Bus(String make, String colour, String fuelType, double tyreSize, int price, int passengerCapacity, int seats, int numOperators) {
        super(make, colour, fuelType, tyreSize, price);
        this.passengerCapacity = passengerCapacity;
        this.seats = seats;
        this.numOperators = numOperators;
    }

    @Override
    public double calculateBill() {
        double randomNum = Math.random();
        return randomNum * 5000;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getNumOperators() {
        return numOperators;
    }

    public void setNumOperators(int numOperators) {
        this.numOperators = numOperators;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCapacity=" + passengerCapacity +
                ", seats=" + seats +
                ", numOperators=" + numOperators +
                "} " + super.toString();
    }
}
