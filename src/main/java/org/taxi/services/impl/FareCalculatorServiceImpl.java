package org.taxi.services.impl;

import org.taxi.services.FareCalculatorService;

// Mocked service with hardcoded values to calculate the fare of a journey as mentioned web service is not ready to do this.
public class FareCalculatorServiceImpl implements FareCalculatorService {
    private static final double FIXED_RATE_PER_MILE = 2.0;
    private static final double RATE_PER_PASSENGER = 1.0;

    @Override
    public double calculateFare(double distance, int passengers) {
        double fare = distance * FIXED_RATE_PER_MILE;
        fare += passengers * RATE_PER_PASSENGER;
        return fare;
    }
}
