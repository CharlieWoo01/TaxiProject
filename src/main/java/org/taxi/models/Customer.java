package org.taxi.models;

public class Customer {
    private String name;
    private String phoneNumber;
    private CardDetails cardDetails;

    public Customer(String name, String phoneNumber, CardDetails cardDetails) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.cardDetails = cardDetails;
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

    public CardDetails getCardDetails() {
        return cardDetails;
    }

    public void setCardDetails(CardDetails cardDetails) {
        this.cardDetails = cardDetails;
    }
}
