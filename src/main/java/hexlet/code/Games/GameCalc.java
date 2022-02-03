package hexlet.code.Games;
import hexlet.code.Cli;

import static hexlet.code.Games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Games.Rand.BOTTOM_LIMIT;
import static hexlet.code.Games.Rand.TOP_LIMIT;
import static hexlet.code.Games.Rand.rand;

public class GameCalc {
    public static final int NUMBER_OPERATION = 3;
    public static final int ADDITION = 1;
    public static final int SUBTRACTION = 2;
    public static final int MULTIPLICATION = 3;
    public static void calc() {
        Boolean isAllCorrect = true;
        Cli.greet();
        String answer = "";
        Cli.outText("What is the result of the expression?");
        String symbol = "";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var rand1 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            var rand2 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            var rand = rand(BOTTOM_LIMIT, NUMBER_OPERATION);
            var result = Integer.MAX_VALUE;
            switch (rand) {
                case ADDITION:
                    result = rand1 + rand2;
                    symbol = " + ";
                    break;
                case SUBTRACTION:
                    symbol = " - ";
                    result = rand1 - rand2;
                    break;
                case MULTIPLICATION:
                    symbol = " * ";
                    result = rand1 * rand2;
                    break;
                default: Cli.outText("Error");
            }
            String correctAnswer = "" + result;
            answer = Cli.request("Question: " + rand1 + symbol + rand2 + "\nYour answer: ");
            if (answer.equals(correctAnswer)) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + correctAnswer + "'" + ".\n" + "Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (isAllCorrect) {
            Cli.outText("Congratulations, " + Cli.getName() + "!");
        }
    }
}
