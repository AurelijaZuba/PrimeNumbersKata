package com.codurance;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsShould {
    private static Stream<Arguments> primeFactorTestProvider() {
        List<Integer> primeFactorsOf1 = asList(1);
        List<Integer> primeFactorsOf2 = asList(2);
        List<Integer> primeFactorsOf3 = asList(3);
        List<Integer> primeFactorsOf4 = asList(2,2);
        List<Integer> primeFactorsOf5 = asList(5);
        List<Integer> primeFactorsOf6 = asList(2, 3);
        List<Integer> primeFactorsOf7 = asList(7);
        List<Integer> primeFactorsOf8 = asList(2,2,2);
        List<Integer> primeFactorsOf9 = asList(3, 3);
        return Stream.of(
                Arguments.of(1, primeFactorsOf1),
                Arguments.of(2, primeFactorsOf2),
                Arguments.of(3, primeFactorsOf3),
                Arguments.of(4, primeFactorsOf4),
                Arguments.of(5, primeFactorsOf5),
                Arguments.of(6, primeFactorsOf6),
                Arguments.of(7, primeFactorsOf7),
                Arguments.of(8, primeFactorsOf8),
                Arguments.of(9, primeFactorsOf9)
        );
    }

    @ParameterizedTest
    @MethodSource("primeFactorTestProvider")
    void generate_prime_factors(int input, List<Integer> expected) {
        List<Integer> result = PrimeFactors.generate(input);

        assertThat(result).hasSameElementsAs(expected);
    }
}
