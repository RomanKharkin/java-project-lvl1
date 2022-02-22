package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.COUPLE_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.LINES_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Utils.BOTTOM_LIMIT;
import static hexlet.code.Utils.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Utils.TOP_LIMIT;
import static hexlet.code.Utils.rand;

public class GameCalc {
    public static final int TOP_LIMIT_OPERATION = 2;
    public static final int BOTTOM_LIMIT_OPERATION = 0;
    public static final int ADDITION = 0;
    public static final int SUBTRACTION = 1;
    public static final int MULTIPLICATION = 2;
    public static final String[] SYMBOL = {" + ", " - ", " * "};

    public static void play() {
        String[][] game = new String[LINES_QUESTIONS_ANSWERS][COUPLE_QUESTIONS_ANSWERS];
        final String condition = "What is the result of the expression?";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            int number1 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            int number2 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            var operationIndex = rand(BOTTOM_LIMIT_OPERATION, TOP_LIMIT_OPERATION);

            var result = calculate(number1, number2, operationIndex);
            game[i][QUESTIONS] = "" + number1 + SYMBOL[operationIndex] + number2;
            game[i][ANSWERS] = "" + result;
        }
        Engine.initGame(condition, game);
    }

    public static int calculate(int number1, int number2, int numberOperation) {
        int result = Integer.MAX_VALUE;
        switch (numberOperation) {
            case ADDITION:
                result = number1 + number2;
                break;
            case SUBTRACTION:
                result = number1 - number2;
                break;
            case MULTIPLICATION:
                result = number1 * number2;
                break;
            default: Cli.outText("Error");
        }
        return result;
    }
}
