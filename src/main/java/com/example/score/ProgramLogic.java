package com.example.score;

public final class ProgramLogic {

    private ProgramLogic() {
    }

    /**
     * Computes a "score" based on two integers using a loop + branching.
     *
     * Rules per value:
     * - negative  -> score -= 2
     * - zero      -> score += 0
     * - positive  -> score += 2
     *
     * Final result:
     * - score > 0  ->  1
     * - score == 0 ->  0
     * - score < 0  -> -1
     */
    public static int computeScore(int a, int b) {
        int score = 0;
        int[] values = {a, b};

        for (int value : values) {
            if (value < 0) {
                score -= 2;
            } else if (value == 0) {
                score += 0;
            } else {
                score += 2;
            }
        }

        if (score > 0) {
            return 1;
        }
        if (score == 0) {
            return 0;
        }
        return -1;
    }
}
