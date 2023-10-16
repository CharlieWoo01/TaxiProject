package org.taxi.services;

import org.taxi.models.Driver;
import org.taxi.models.Rating;

public interface RatingService {
    Rating addDriverStarRating(Driver driver);
}
