package hexlet.code.Games;
import hexlet.code.Cli;
import hexlet.code.Engine;

import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.QUESTIONS_ANSWERS;
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
        String[] game = new String[QUESTIONS_ANSWERS];
        game[0] = "What is the result of the expression?";
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
            game[i + ANSWERS] = "" + result;
            game[i + QUESTIONS] = "" + rand1 + symbol + rand2;
        }
        Engine.play(game);
    }
}
