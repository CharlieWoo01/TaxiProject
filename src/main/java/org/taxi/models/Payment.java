package org.taxi.models;

public class Payment {
    private double totalAmount;
    private double uberCommission;
    private double appCommission;

    public Payment(double totalAmount, double uberCommission, double appCommission) {
        this.totalAmount = totalAmount;
        this.uberCommission = uberCommission;
        this.appCommission = appCommission;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getUberCommission() {
        return uberCommission;
    }

    public void setUberCommission(double uberCommission) {
        this.uberCommission = uberCommission;
    }

    public double getAppCommission() {
        return appCommission;
    }

    public void setAppCommission(double appCommission) {
        this.appCommission = appCommission;
    }
}
