package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.COUPLE_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.NUMBER_CORRECT_ANSWERS;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Utils.BOTTOM_LIMIT;
import static hexlet.code.Utils.TOP_LIMIT;
import static hexlet.code.Utils.rand;

public class GameGcd {
    public static final String CONDITION = "Find the greatest common divisor of given numbers.";

    public static void play() {
        String[][] questionsAndAnswers = new String[NUMBER_CORRECT_ANSWERS][COUPLE_QUESTIONS_ANSWERS];

        for (int i = 0; i < NUMBER_CORRECT_ANSWERS; i++) {
            var number1 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            var number2 = rand(BOTTOM_LIMIT, TOP_LIMIT);

            questionsAndAnswers[i][QUESTION] = number1 + " " + number2;
            questionsAndAnswers[i][ANSWER] = String.valueOf(findGcd(number1, number2));
        }
        Engine.runGame(CONDITION, questionsAndAnswers);
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
