package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Utils.TOP_LIMIT;
import static hexlet.code.Utils.rand;

public class GameCalc {
    public static final int TOP_LIMIT_OPERATION = 2;
    public static final int BOTTOM_LIMIT_OPERATION = 0;
    public static final int ADDITION = 0;
    public static final int SUBTRACTION = 1;
    public static final int MULTIPLICATION = 2;
    public static final String[] SYMBOLS = {" + ", " - ", " * "};
    public static final String CONDITION = "What is the result of the expression?";

    public static void play() {
        String[][] questionsAndAnswers = new String[Engine.NUMBER_CORRECT_ANSWERS][Engine.COUPLE_QUESTIONS_ANSWERS];

        for (int i = 0; i < Engine.NUMBER_CORRECT_ANSWERS; i++) {
            int number1 = rand(TOP_LIMIT);
            int number2 = rand(TOP_LIMIT);
            var operationIndex = rand(BOTTOM_LIMIT_OPERATION, TOP_LIMIT_OPERATION);

            var result = calculate(number1, number2, operationIndex);
            questionsAndAnswers[i][Engine.QUESTION] = number1 + SYMBOLS[operationIndex] + number2;
            questionsAndAnswers[i][Engine.ANSWER] = String.valueOf(result);
        }
        Engine.runGame(CONDITION, questionsAndAnswers);
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
            default: System.out.println("Error");
        }
        return result;
    }
}
