package org.taxi.services.impl;

import org.taxi.models.Customer;
import org.taxi.models.Journey;
import org.taxi.models.JourneyHistory;
import org.taxi.services.FareCalculatorService;
import org.taxi.services.JourneyService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JourneyServiceImpl implements JourneyService {

    private FareCalculatorService fareCalculator;

    List<Journey> newJourneys = new ArrayList<>();
    JourneyHistory journeyHistory = new JourneyHistory(newJourneys);

    public JourneyServiceImpl(FareCalculatorService fareCalculator) {
        this.fareCalculator = fareCalculator;
    }

    @Override
    public List<Journey> createJourney(Customer customer) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start postcode: ");
        String startLocation = scanner.nextLine();

        System.out.print("Enter end postcode: ");
        String endLocation = scanner.nextLine();

        System.out.print("Enter number of passengers: ");
        int numOfPassengers = scanner.nextInt();

        double distance = getDistanceFromWebService(startLocation, endLocation);

        double cost = fareCalculator.calculateFare(distance, numOfPassengers);
        LocalDateTime startDate = LocalDateTime.now();

        Journey journey = new Journey(null, customer, distance, cost, startLocation, endLocation, startDate, null, numOfPassengers);

        return addJourneyHistory(journey);
    }

    @Override
    public List<Journey> addJourneyHistory(Journey journey) {
        newJourneys.add(journey);
        journeyHistory.setJourneys(newJourneys);
        return journeyHistory.getJourneys();
    }

    // Mocked method to get distance from the mentioned incomplete service to calculate this
    private double getDistanceFromWebService(String startLocation, String endLocation) {
        return 10.0;
    }
}
