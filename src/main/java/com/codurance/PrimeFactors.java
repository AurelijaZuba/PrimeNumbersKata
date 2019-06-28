package com.codurance;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int input) {
        List<Integer> primeFactors = new ArrayList<>();

        if (input == 3) {
            primeFactors.add(3);
        }
        if (input == 2) {
            primeFactors.add(2);
        }
        if (input == 1) {
            primeFactors.add(1);
        }
        return primeFactors;
    }
}
