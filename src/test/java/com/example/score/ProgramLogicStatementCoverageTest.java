package com.example.score;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramLogicStatementCoverageTest {

    @Test
    void returnsPositiveOne_whenBothPositive() {
        assertEquals(1, ProgramLogic.computeScore(1, 1));
    }

    @Test
    void returnsZero_whenOnePositiveOneNegative() {
        assertEquals(0, ProgramLogic.computeScore(1, -1));
    }

    @Test
    void returnsNegativeOne_whenZeroAndNegative() {
        assertEquals(-1, ProgramLogic.computeScore(0, -1));
    }
}
