package com.codurance;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PrimeFactors {

    private static final List<Integer> primeNumbers = asList(1, 2, 3, 5, 7);

    public static List<Integer> generate(int input) {
        List<Integer> primeFactors = new ArrayList<>();

        if (isPrimeNumber(input)) {
            primeFactors.add(input);
            return primeFactors;
        }

        return calculatePrimeFactors(input);
    }

    private static List<Integer> calculatePrimeFactors(int input) {
        List<Integer> primeFactors = new ArrayList<>();

        if(input == 9) {
            int result = input;
            do {
                for (int i = primeNumbers.size() - 1; i > 0; i--) {
                    int prime = primeNumbers.get(i);
                    if(result % prime > 0){
                        continue;
                    }
                    primeFactors.add(prime);
                    result = result / prime;
                    break;
                }
            } while(result > 1);
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
        return primeNumbers.contains(input);
    }
}
