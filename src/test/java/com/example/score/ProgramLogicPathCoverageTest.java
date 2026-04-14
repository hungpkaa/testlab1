package com.example.score;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramLogicPathCoverageTest {

    static Stream<Arguments> allPaths() {
        // Values are chosen to force each distinct path through the two iterations:
        // (neg/zero/pos) x (neg/zero/pos) = 9 paths.
        return Stream.of(
                Arguments.of(-1, -1, -1),
                Arguments.of(-1, 0, -1),
                Arguments.of(-1, 1, 0),
                Arguments.of(0, -1, -1),
                Arguments.of(0, 0, 0),
                Arguments.of(0, 1, 1),
                Arguments.of(1, -1, 0),
                Arguments.of(1, 0, 1),
                Arguments.of(1, 1, 1)
        );
    }

    @ParameterizedTest(name = "computeScore({0},{1}) -> {2}")
    @MethodSource("allPaths")
    void coversAllControlFlowPaths(int a, int b, int expected) {
        assertEquals(expected, ProgramLogic.computeScore(a, b));
    }
}
