package com.company;

public class Plane {
    private String model;
     private  String country;
     private int year;
     private int hours;
     private  boolean military;
     private int weight;
     private  int wingspan;
     private int topSpeed;
     private int seats;
     private float cost;

    public String getModel() { return this.model; }
    public void setModel(String model) {
        if(!model.isEmpty())
           this.model = model;
    }
    public String getCountry() { return this.country; }
    public void setCountry(String country) {
        if(!country.isEmpty())
            this.country = country;
    }
    public int getYear() { return this.year; }
    public void setYear(int year) {
        if (year > 1903 && year < 2020)
            this.year = year;
    }
    public int getHours() { return this.hours; }
    public void setHours(int hours) {
        if (hours > 0 && hours < 10000)
            this.hours = hours;
    }
    public boolean getMilitary() { return this.military; }
    public void setMilitary(boolean military) {

        this.military = military ;
    }
    public int getWeight() { return this.weight; }
    public void setWeight(int weight) {
        if (weight > 1000 && weight < 160000)
            this.weight = weight;
    }
    public int getWingspan() { return this.wingspan; }
    public void setWingspan(int wingspan) {
        if (wingspan > 10 && wingspan < 45)
            this.wingspan = wingspan;
    }
    public int getTopSpeed() { return this.topSpeed; }
    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0 && topSpeed <=1000)
            this.topSpeed = topSpeed;
    }
    public int getSeats() { return this.seats; }
    public void setSeats(int seats) {
        if (seats >= 0)
            this.seats = seats;
    }
    public float getCost() { return this.cost; }
    public void setCost(float cost) {
        if (cost >=0)
            this.cost = cost;
    }

}
