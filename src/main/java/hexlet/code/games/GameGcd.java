package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.COUPLE_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.LINES_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Utils.BOTTOM_LIMIT;
import static hexlet.code.Utils.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Utils.TOP_LIMIT;
import static hexlet.code.Utils.rand;

public class GameGcd {

    public static void play() {
        String[][] game = new String[LINES_QUESTIONS_ANSWERS][COUPLE_QUESTIONS_ANSWERS];
        final String condition = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var number1 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            var number2 = rand(BOTTOM_LIMIT, TOP_LIMIT);

            game[i][QUESTIONS] = number1 + " " + number2;
            game[i][ANSWERS] = "" + findGcd(number1, number2);
        }
        Engine.initGame(condition, game);
    }

    public static int findGcd(int number1, int number2) {
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
