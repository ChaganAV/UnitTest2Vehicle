package com.example.unittest2vehicle;

import com.example.unittest2vehicle.model.Car;
import com.example.unittest2vehicle.model.Motorcycle;

public class UnitTest2Vehicle {
    public static void main(String[] args) {
        Car bmw = new Car("BMW","X4",2016);
        Car lada = new Car("VAZ","Granta",2018);
        Motorcycle jawa = new Motorcycle("Chehy", "Sport", 1996,2);
        System.out.println(bmw);
        System.out.println(lada);
        System.out.println(jawa);
    }
}
