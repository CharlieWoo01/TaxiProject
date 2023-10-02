package org.taxi.utils;

public class Utils {

    public String firstLetterToUpper(String str) {
        String capitalise = str.substring(0, 1).toUpperCase() + str.substring(1);
        return capitalise;
    }
}
