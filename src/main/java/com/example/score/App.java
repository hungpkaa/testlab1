package com.example.score;

public final class App {

    public static void main(String[] args) {
        int a = 3;
        int b = -1;

        if (args.length >= 2) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        }

        int result = ProgramLogic.computeScore(a, b);
        System.out.println("computeScore(" + a + ", " + b + ") = " + result);
    }
}
