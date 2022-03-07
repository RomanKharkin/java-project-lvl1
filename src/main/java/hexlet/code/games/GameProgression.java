package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.COUPLE_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.LINES_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Utils.BOTTOM_LIMIT;
import static hexlet.code.Utils.rand;


public class GameProgression {
    public static final int PROGRESSION_STEP = 10;
    public static final int PROGRESSION_START = 15;
    public static final int PROGRESSION_MEMBERS = 5;
    public static final String CONDITION = "What number is missing in the progression?";

    public static void play() {
        String[][] questionsAndAnswers = new String[LINES_QUESTIONS_ANSWERS][COUPLE_QUESTIONS_ANSWERS];

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var progressionLength = rand(PROGRESSION_MEMBERS, PROGRESSION_MEMBERS);
            var step = rand(BOTTOM_LIMIT, PROGRESSION_STEP);
            var current = rand(BOTTOM_LIMIT, PROGRESSION_START);
            var hiddenElementIndex = rand(BOTTOM_LIMIT, progressionLength);
            var hiddenElementValue = -1;
            String progression = "";
            for (int j = 0; j < progressionLength; j++) {
                current += step;
                if (j == hiddenElementIndex) {
                    hiddenElementValue = current;
                    progression += " " + "..";
                } else {
                    progression += " " + current;
                }
            }
            questionsAndAnswers[i][QUESTIONS] = progression.trim();
            questionsAndAnswers[i][ANSWERS] = String.valueOf(hiddenElementValue);
        }
        Engine.runGame(CONDITION, questionsAndAnswers);
    }
}
