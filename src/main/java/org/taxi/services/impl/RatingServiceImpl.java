package org.taxi.services.impl;

import org.taxi.models.Driver;
import org.taxi.models.Rating;
import org.taxi.services.RatingService;

import java.util.Scanner;

public class RatingServiceImpl implements RatingService {

    @Override
    public Rating addDriverStarRating(Driver driver) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give your driver a rating from 0-5");
        int driverRating = scanner.nextInt();

        Rating rating = new Rating();
        return rating;
    }

}
