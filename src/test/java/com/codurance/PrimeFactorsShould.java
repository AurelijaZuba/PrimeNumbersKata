package com.codurance;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsShould {
    private static Stream<Arguments> primeFactorTestProvider() {
        List<Integer> primeFactorsOf1 = asList(1);
        List<Integer> primeFactorsOf2 = asList(2);
        return Stream.of(
                Arguments.of(1, primeFactorsOf1),
                Arguments.of(2, primeFactorsOf2)
        );
    }

    @ParameterizedTest
    @MethodSource("primeFactorTestProvider")
    void generate_prime_factors(int input, List<Integer> expected) {
        List<Integer> result = PrimeFactors.generate(input);

        assertThat(result).hasSameElementsAs(expected);
    }
}
