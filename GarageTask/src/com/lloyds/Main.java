package com.lloyds;

import com.lloyds.vehicles.Aeroplane;
import com.lloyds.vehicles.Bus;
import com.lloyds.vehicles.Car;
import com.lloyds.Garage;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "Black", "Petrol", 19, 20000, 5, false, 60);
        Car car2 = new Car("Audi", "Red", "Petrol", 19, 15000, 3, true, 60);
        Car car3 = new Car("Nissan", "Black", "Petrol", 19, 10000, 5, false, 60);

        Aeroplane plane1 = new Aeroplane("Airbus", "White", "Petrol", 50, 10000000, "A330", 2, 35);
        Aeroplane plane2 = new Aeroplane("Airbus", "White", "Petrol", 50, 20000000, "A380", 4, 6);
        Aeroplane plane3 = new Aeroplane("Boeing", "White", "Petrol", 50, 10000000, "787", 2, 35);

        Bus bus1 = new Bus("Mercedes", "Blue", "Electric", 30, 80000, 50, 30, 15);
        Bus bus2 = new Bus("Mercedes", "White", "Electric", 30, 80000, 100, 60, 10);
        Bus bus3 = new Bus("Mercedes", "Pink", "Electric", 30, 80000, 70, 40, 30);

        Garage garage1 = new Garage();

        garage1.addVehicle(car1);
        garage1.addVehicle(car2);
        garage1.addVehicle(car3);

        garage1.addVehicle(plane1);
        garage1.addVehicle(plane2);
        garage1.addVehicle(plane3);

        garage1.addVehicle(bus1);
        garage1.addVehicle(bus2);
        garage1.addVehicle(bus3);
    }
}