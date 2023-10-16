package org.taxi.models;

import java.util.ArrayList;
import java.util.List;

public class Rating {
    private double averageRating;
    private List<Double> ratings;

    public Rating() {
        this.averageRating = 0.0;
        this.ratings = new ArrayList<>();
    }

    public double getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(double averageRating) {
        this.averageRating = averageRating;
    }

    public List<Double> getRatings() {
        return ratings;
    }

    public void setRatings(List<Double> ratings) {
        this.ratings = ratings;
    }
}
