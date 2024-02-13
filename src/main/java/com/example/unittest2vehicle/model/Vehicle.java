package com.example.unittest2vehicle.model;

public abstract class Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    /**
     * движение
     * уставливаем скорость
     */
    void testDrive(){
        setSpeed(0);
    }

    /**
     * парковка
     * устанавливает скорость в 0
     */
    void park(){
        setSpeed(0);
    }

    @Override
    public String toString() {
        return  "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", numWheels=" + numWheels +
                ", speed=" + speed +
                '}';
    }

    // region getters

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    // endregion
}
