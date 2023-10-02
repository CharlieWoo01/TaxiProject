package org.taxi.services;

import org.taxi.models.CardDetails;
import org.taxi.models.Customer;
import org.taxi.utils.Utils;

import java.util.Scanner;

public class CustomerService {

    private Utils utils;

    public CustomerService(Utils utils) {
        this.utils = utils;
    }

    public Customer registerCustomer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        name = utils.firstLetterToUpper(name);

        System.out.println("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        CardDetails cardDetails = this.addCardDetails();

        Customer customer = new Customer(name, phoneNumber, cardDetails);

        return customer;
    }

    protected CardDetails addCardDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your card number: ");
        String cardNumber = scanner.nextLine();

        System.out.println("Enter your expiry date: ");
        String expiryDate = scanner.nextLine();

        System.out.println("Enter your CVV/CVC code: ");
        String cvvCode = scanner.nextLine();

        CardDetails cardDetails = new CardDetails(cardNumber, expiryDate, cvvCode);

        return cardDetails;
    }
}
