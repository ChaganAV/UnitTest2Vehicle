package com.example.unittest2vehicle.model;

public class Car extends Vehicle{
    public Car() {
    }
    public Car(String company, String model, int year){
        super.setCompany(company);
        super.setModel(model);
        super.setYearRelease(year);
        super.setNumWheels(4);
        testDrive();
    }

    @Override
    public void testDrive() {
        setSpeed(60);
//        if (speed<= 180)
//            super.testDrive(speed);
//        else{
//            System.out.println("Скорость слишком высокая, Боливар не выдержит");
//        }
//        if(speed<0){
//            System.out.println("Скорость не может быть отрицательной, лучше включите заднюю передачу ;)");
//        }
    }

    @Override
    public void park() {
        super.park();
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + "} " ;
    }
}
