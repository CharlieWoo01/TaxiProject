package org.taxi.services;

import org.taxi.models.CardDetails;
import org.taxi.models.Customer;

public interface CustomerService {
    Customer registerCustomer();

    CardDetails addCardDetails();
}
