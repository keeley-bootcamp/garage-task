package com.lloyds;

import com.lloyds.vehicles.Aeroplane;
import com.lloyds.vehicles.Bus;
import com.lloyds.vehicles.Car;
import com.lloyds.vehicles.Vehicle;

import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> garage = new ArrayList<>();

    public ArrayList<Vehicle> getGarage() {
        return garage;
    }

    public void setGarage(ArrayList<Vehicle> garage) {
        this.garage = garage;
    }

    public void addVehicle(Vehicle vehicle) {
        garage.add(vehicle);
    }

    public static double calculateBill(Vehicle vehicle) {
        double randomNum = Math.random();
        return randomNum * vehicle.multiplier;
    }
}
