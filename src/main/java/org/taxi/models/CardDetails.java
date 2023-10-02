package org.taxi.models;

public class CardDetails {

    private String cardNumber;

    private String cardExpiryDate;

    private String cvvCode;

    public CardDetails(String cardNumber, String cardExpiryDate, String cvvCode) {
        this.cardNumber = cardNumber;
        this.cardExpiryDate = cardExpiryDate;
        this.cvvCode = cvvCode;
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

    public String getCvvCode() {
        return cvvCode;
    }

    public void setCvvCode(String cvvCode) {
        this.cvvCode = cvvCode;
    }

    @Override
    public String toString() {
        return "CardDetails{" +
                "cardNumber='" + cardNumber + '\'' +
                ", cardExpiryDate='" + cardExpiryDate + '\'' +
                ", cvvCode='" + cvvCode + '\'' +
                '}';
    }
}
