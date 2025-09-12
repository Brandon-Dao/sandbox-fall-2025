package org.example.sandbox.Inheritance;

public class Helicopter extends Vehicle implements Flyable{

    private int rotorCount;
    private double mpg;

    public Helicopter(String brand, String model, int year, double fuelCapacity, double mpg, double v) {
        super(brand, model, year, fuelCapacity,mpg);

    }

    @Override
    public double getMaxAltitude() {
        return 15000.0;
    }

    @Override
    public void land() {
        System.out.println(" Helicoper landing");
    }

    @Override
    public void takeOff() {
        System.out.println(" Helicoper taking off");
    }

    @Override
    public void honk() {
        super.honk();
    }

    @Override
    public double getMaxSpeed() {
        return 0;
    }

    @Override
    public void stop() {
    System.out.println(" Helicoper stop");
    }

    @Override
    public void start() {
        System.out.println(" Helicoper starts");
    }

    @Override
    public void refuel() {
        System.out.println(" Helicoper refueling");
    }


    @Override
    public String getModel() {
        return super.getModel();
    }



    @Override
    public void displayInfo() {
        super.displayInfo();
    }


}
