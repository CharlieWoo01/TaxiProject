package org.taxi;

import org.taxi.models.Customer;
import org.taxi.models.Journey;
import org.taxi.services.CustomerService;
import org.taxi.services.impl.CustomerServiceImpl;
import org.taxi.services.impl.FareCalculatorServiceImpl;
import org.taxi.services.impl.JourneyService;
import org.taxi.services.impl.JourneyServiceImpl;
import org.taxi.utils.Utils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Utils util = new Utils();
        CustomerService customerService = new CustomerServiceImpl(util);

        JourneyService journeyService = new JourneyServiceImpl(new FareCalculatorServiceImpl());

        Customer registeredCustomer = customerService.registerCustomer();

        System.out.println("Customer registration successful!");
        System.out.println("Registered Customer Details:");
        System.out.println(registeredCustomer);

        List<Journey> journeyDetails = journeyService.createJourney(registeredCustomer);

        System.out.println("Customer Journey Details:");

        for (Journey journey : journeyDetails) {
            System.out.println(journey);
        }
    }
}