package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.QUESTIONS_ANSWERS;
import static hexlet.code.games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.games.Rand.BOTTOM_LIMIT;
import static hexlet.code.games.Rand.rand;


public class GameProgression {
    public static final int PROGRESSION_STEP = 10;
    public static final int PROGRESSION_START = 15;
    public static final int PROGRESSION_MEMBERS = 5;

    public static void play() {
        String[][] game = new String[QUESTIONS_ANSWERS][QUESTIONS_ANSWERS];
        String condition = "What number is missing in the progression?";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var number = rand(PROGRESSION_MEMBERS, PROGRESSION_MEMBERS);
            var step = rand(BOTTOM_LIMIT, PROGRESSION_STEP);
            var start = rand(BOTTOM_LIMIT, PROGRESSION_START);
            var pass = rand(BOTTOM_LIMIT, number);
            var result = -1;
            String progression = "";
            for (int j = 1; j < number + 1; j++) {
                start += step;
                if (j == pass) {
                    result = start;
                    progression += " " + "..";
                } else {
                    progression += " " + start;
                }
            }
            game[QUESTIONS][i] = progression.trim();
            game[ANSWERS][i] = "" + result;
        }
        Engine.initGame(condition, game);
    }
}
