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

    public void removeVehicle(int id) {
        garage.remove(id);
    }

    public void clearGarage() {
        garage.clear();
    }

    public void removeByType(String type) {
        if (type.equalsIgnoreCase("Car")) {
            this.garage.removeIf(vehicle -> vehicle instanceof Car);
        }
        if (type.equalsIgnoreCase("Aeroplane")) {
            this.garage.removeIf(vehicle -> vehicle instanceof Aeroplane);
        }
        if (type.equalsIgnoreCase("Bus")) {
            this.garage.removeIf(vehicle -> vehicle instanceof Bus);
        }
    }

    public void calculateBill() {
        for (Vehicle vehicle : this.garage) {
            System.out.println(vehicle.toString());
            System.out.println("Bill: £" + Math.round(vehicle.calculateBill() * 100.0) / 100.0);
        }
    }
}
