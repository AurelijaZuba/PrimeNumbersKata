package com.codurance;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class PrimeFactorsShould {
    private static Stream<Arguments> primeFactorTestProvider() {
        return Stream.of(
                Arguments.of(1, new Integer[]{1})
        );
    }

    @ParameterizedTest
    @MethodSource("primeFactorTestProvider")
    void generate_prime_factors(int input, Integer[] expected) {
        List<Integer> result = PrimeFactors.generate(input);

        assertThat(result).isEqualTo(expected);
    }
}
