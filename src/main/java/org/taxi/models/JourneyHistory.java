package org.taxi.models;

import java.util.List;

public class JourneyHistory {
    private List<Journey> journeys;

    public JourneyHistory(List<Journey> journeys) {
        this.journeys = journeys;
    }

    public List<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(List<Journey> journeys) {
        this.journeys = journeys;
    }
}
