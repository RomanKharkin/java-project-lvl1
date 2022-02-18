package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.QUESTIONS_ANSWERS;
import static hexlet.code.games.Rand.BOTTOM_LIMIT;
import static hexlet.code.games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.games.Rand.TOP_LIMIT;
import static hexlet.code.games.Rand.rand;


public class GameGcd {
    public static void gcd() {
        String[][] game = new String[QUESTIONS_ANSWERS][QUESTIONS_ANSWERS];
        String condition = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var number1 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            var number2 = rand(BOTTOM_LIMIT, TOP_LIMIT);

            game[QUESTIONS][i] = number1 + " " + number2;
            game[ANSWERS][i] = "" + operation(number1, number2);
        }
        Engine.play(condition, game);
    }

    public static int operation(int number1, int number2) {
        int result = Integer.MAX_VALUE;
        for (int j = TOP_LIMIT; j > 0; j--) {
            if (number1 % j == 0 && number2 % j == 0) {
                result = j;
                break;
            }
        }
        return result;
    }
}
