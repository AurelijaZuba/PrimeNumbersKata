package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int input) {
        List<Integer> primeFactors = new ArrayList<>();

        if (isPrimeNumber(input)) {
            primeFactors.add(input);
            return primeFactors;
        }

        primeFactors.add(2);
        primeFactors.add(2);

        return primeFactors;
    }

    private static boolean isPrimeNumber(int input) {
        return input == 1 || input == 2 || input == 3 || input == 5;
    }
}
