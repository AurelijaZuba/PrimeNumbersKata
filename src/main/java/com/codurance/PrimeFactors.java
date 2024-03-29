package com.codurance;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PrimeFactors {

    private static final List<Integer> primeNumbers = asList(1, 2, 3, 5, 7);
    private static List<Integer> primeFactors;

    public static List<Integer> generate(int input) {
        primeFactors = new ArrayList<>();

        if (isPrimeNumber(input)) {
            primeFactors.add(input);
            return primeFactors;
        }

        int result = input;
        do {
            result = identifyFactors(result);
        } while(result > 1);
        return primeFactors;
    }

    private static int identifyFactors(int result) {
        for (int i = primeNumbers.size() - 1; i > 0; i--) {
            result = divideResultByPrimeFactor(result, i);
        }
        return result;
    }

    private static int divideResultByPrimeFactor(int result, int i) {
        int prime = primeNumbers.get(i);
        if(isDivisibleByPrime(result, prime)){
            result = storePrimeAndDivide(result, prime);
        }
        return result;
    }

    private static int storePrimeAndDivide(int result, int prime) {
        primeFactors.add(prime);
        result = result / prime;
        return result;
    }

    private static boolean isDivisibleByPrime(int result, int prime) {
        return result % prime == 0;
    }

    private static boolean isPrimeNumber(int input) {
        return primeNumbers.contains(input);
    }
}
