package org.taxi.models;

public class CardDetails {

    private String cardNumber;

    private String cardExpiryDate;

    private String cardholderName;

    public CardDetails(String cardNumber, String cardExpiryDate, String cardholderName) {
        this.cardNumber = cardNumber;
        this.cardExpiryDate = cardExpiryDate;
        this.cardholderName = cardholderName;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    public void setCardExpiryDate(String cardExpiryDate) {
        this.cardExpiryDate = cardExpiryDate;
    }
}
