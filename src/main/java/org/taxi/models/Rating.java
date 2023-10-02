package org.taxi.models;

import java.util.List;

public class Rating {
    private double averageRating;
    private List<Double> ratings;

    public Rating(double averageRating, List<Double> ratings) {
        this.averageRating = averageRating;
        this.ratings = ratings;
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
