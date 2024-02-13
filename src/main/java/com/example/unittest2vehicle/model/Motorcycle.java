package com.example.unittest2vehicle.model;

public class Motorcycle extends Vehicle{
    public Motorcycle() {
    }
    public Motorcycle(String company, String model, int year){
        super.setCompany(company);
        super.setModel(model);
        super.setYearRelease(year);
        super.setNumWheels(2);
        testDrive();
    }
    @Override
    public void testDrive() {
        setSpeed(75);
//        if (speed<= 200)
//            super.testDrive(speed);
//        else{
//            System.out.println("Скорость слишком высокая, Боливар не выдержит");
//        }
//        if(speed<0){
//            System.out.println("Скорость не может быть отрицательной, просто толкайте его ;)");
//        }
    }

    @Override
    public void park() {
        super.park();
    }

    @Override
    public String toString() {
        return "Motorcycle{" + super.toString() + "}";
    }
}
