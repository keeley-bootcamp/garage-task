package com.lloyds.vehicles;

public class Aeroplane extends Vehicle{
    private String model;
    private int numEngines;
    private int airlinesThatUse;

    public Aeroplane(String make, String colour, String fuelType, double tyreSize, int price, String model, int numEngines, int airlinesThatUse) {
        super(make, colour, fuelType, tyreSize, price);
        this.model = model;
        this.numEngines = numEngines;
        this.airlinesThatUse = airlinesThatUse;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumEngines() {
        return numEngines;
    }

    public void setNumEngines(int numEngines) {
        this.numEngines = numEngines;
    }

    public int getAirlinesThatUse() {
        return airlinesThatUse;
    }

    public void setAirlinesThatUse(int airlinesThatUse) {
        this.airlinesThatUse = airlinesThatUse;
    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "model='" + model + '\'' +
                ", numEngines=" + numEngines +
                ", airlinesThatUse=" + airlinesThatUse +
                "} " + super.toString();
    }
}
