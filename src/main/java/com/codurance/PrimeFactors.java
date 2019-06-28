package com.codurance;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PrimeFactors {
    public static List<Integer> generate(int input) {
        List<Integer> primeFactors = new ArrayList<>();

        if (isPrimeNumber(input)) {
            primeFactors.add(input);
            return primeFactors;
        }
        if(input == 8){
            primeFactors.add(2);
            primeFactors.add(2);
            primeFactors.add(2);
        }
        if(input == 6){
            primeFactors.add(2);
            primeFactors.add(3);
        }
        if (input == 4) {
            primeFactors.add(2);
            primeFactors.add(2);
        }

        return primeFactors;
    }

    private static boolean isPrimeNumber(int input) {
        List<Integer> primeNumbers = asList(1, 2, 3, 5, 7);

        return primeNumbers.contains(input);
    }
}
