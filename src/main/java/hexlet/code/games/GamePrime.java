package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.QUESTIONS_ANSWERS;
import static hexlet.code.games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.games.Rand.rand;

public class GamePrime {
    public static final int TOP_LIMIT_PRIME = 20;
    public static final int BOTTOM_LIMIT_PRIME = 2;

    public static void play() {
        String[][] game = new String[QUESTIONS_ANSWERS][QUESTIONS_ANSWERS];
        String condition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var number = rand(BOTTOM_LIMIT_PRIME, TOP_LIMIT_PRIME);
            game[QUESTIONS][i] = "" + number;
            game[ANSWERS][i] = operation(number) == 1 ? "yes" : "no";
        }
        Engine.initGame(condition, game);
    }

    public static int operation(int number) {
        int result = 1;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = i;
            }
        }
        if (number == 1) {
            result = 2;
        }
        return result;
    }
}
