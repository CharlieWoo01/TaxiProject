package org.taxi.services;

import org.taxi.models.Customer;
import org.taxi.models.Journey;

import java.util.List;

public interface JourneyService {
    List<Journey> createJourney(Customer customer);

    List<Journey> addJourneyHistory(Journey journey);
}
