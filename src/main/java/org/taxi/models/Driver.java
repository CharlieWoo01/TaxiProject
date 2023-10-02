package org.taxi.models;

public class Driver {
    private String name;
    private String phoneNumber;
    private String carType;
    private int maxPassengers;
    private double rating;

    public Driver(String name, String phoneNumber, String carType, int maxPassengers) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.carType = carType;
        this.maxPassengers = maxPassengers;
        this.rating = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
