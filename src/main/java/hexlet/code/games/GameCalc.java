package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.QUESTIONS_ANSWERS;
import static hexlet.code.games.Rand.BOTTOM_LIMIT;
import static hexlet.code.games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.games.Rand.TOP_LIMIT;
import static hexlet.code.games.Rand.rand;

public class GameCalc {
    public static final int TOP_LIMIT_OPERATION = 2;
    public static final int BOTTOM_LIMIT_OPERATION = 0;
    public static final int ADDITION = 0;
    public static final int SUBTRACTION = 1;
    public static final int MULTIPLICATION = 2;

    public static void calc() {
        String[][] game = new String[QUESTIONS_ANSWERS][QUESTIONS_ANSWERS];
        String condition = "What is the result of the expression?";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var number1 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            var number2 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            int[] numbers = {number1, number2};
            var operationIndex = rand(BOTTOM_LIMIT_OPERATION, TOP_LIMIT_OPERATION);
            var result = Integer.MAX_VALUE;
            String[] symbol = {" + ", " - ", " * "};

            result = operation(numbers, operationIndex);
            game[QUESTIONS][i] = "" + number1 + symbol[operationIndex] + number2;
            game[ANSWERS][i] = "" + result;
        }
        Engine.play(condition, game);
    }

    public static int operation(int[] numbers, int numberOperation) {
        int result = Integer.MAX_VALUE;
        switch (numberOperation) {
            case ADDITION:
                result = numbers[0] + numbers[1];
                break;
            case SUBTRACTION:
                result = numbers[0] - numbers[1];
                break;
            case MULTIPLICATION:
                result = numbers[0] * numbers[1];
                break;
            default: Cli.outText("Error");
        }
        return result;
    }
}
