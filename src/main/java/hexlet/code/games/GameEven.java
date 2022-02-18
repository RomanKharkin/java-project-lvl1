package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.QUESTIONS_ANSWERS;
import static hexlet.code.games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.games.Rand.rand;
import static hexlet.code.games.Rand.BOTTOM_LIMIT;
import static hexlet.code.games.Rand.TOP_LIMIT;

public class GameEven {

    public static void play() {
        String[][] game = new String[QUESTIONS_ANSWERS][QUESTIONS_ANSWERS];
        String condition = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var num = rand(BOTTOM_LIMIT, TOP_LIMIT);
            game[QUESTIONS][i] = "" + num;
            game[ANSWERS][i] = num % 2 == 0 ? "yes" : "no";
        }
        Engine.initGame(condition, game);
    }
}
