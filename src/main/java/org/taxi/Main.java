package org.taxi;

import org.taxi.models.Customer;
import org.taxi.services.CustomerService;
import org.taxi.services.impl.CustomerServiceImpl;
import org.taxi.utils.Utils;

public class Main {
    public static void main(String[] args) {
        Utils util = new Utils();
        CustomerService customerService = new CustomerServiceImpl(util);

        Customer registeredCustomer = customerService.registerCustomer();

        System.out.println("Customer registration successful!");
        System.out.println("Registered Customer Details:");
        System.out.println(registeredCustomer);
    }
}