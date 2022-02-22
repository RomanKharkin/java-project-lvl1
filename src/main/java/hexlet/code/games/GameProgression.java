package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.LINES_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.COUPLE_QUESTIONS_ANSWERS;
import static hexlet.code.Utils.BOTTOM_LIMIT;
import static hexlet.code.Utils.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Utils.rand;


public class GameProgression {
    public static final int PROGRESSION_STEP = 10;
    public static final int PROGRESSION_START = 15;
    public static final int PROGRESSION_MEMBERS = 5;

    public static void play() {
        String[][] game = new String[LINES_QUESTIONS_ANSWERS][COUPLE_QUESTIONS_ANSWERS];
        final String condition = "What number is missing in the progression?";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var progressionLength = rand(PROGRESSION_MEMBERS, PROGRESSION_MEMBERS);
            var step = rand(BOTTOM_LIMIT, PROGRESSION_STEP);
            var start = rand(BOTTOM_LIMIT, PROGRESSION_START);
            var hiddenElementIndex = rand(BOTTOM_LIMIT, progressionLength);
            var hiddenElementValue = -1;
            String progression = "";
            for (int j = 1; j < progressionLength + 1; j++) {
                start += step;
                if (j == hiddenElementIndex) {
                    hiddenElementValue = start;
                    progression += " " + "..";
                } else {
                    progression += " " + start;
                }
            }
            game[i][QUESTIONS] = progression.trim();
            game[i][ANSWERS] = "" + hiddenElementValue;
        }
        Engine.initGame(condition, game);
    }
}
