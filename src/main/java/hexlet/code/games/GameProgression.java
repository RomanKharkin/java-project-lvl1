package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.COUPLE_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.NUMBER_CORRECT_ANSWERS;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Utils.BOTTOM_LIMIT;
import static hexlet.code.Utils.rand;


public class GameProgression {
    public static final int PROGRESSION_STEP = 10;
    public static final int PROGRESSION_START = 15;
    public static final int PROGRESSION_MEMBERS = 5;
    public static final String CONDITION = "What number is missing in the progression?";

    public static void play() {
        String[][] questionsAndAnswers = new String[NUMBER_CORRECT_ANSWERS][COUPLE_QUESTIONS_ANSWERS];

        for (int i = 0; i < NUMBER_CORRECT_ANSWERS; i++) {
            var progressionLength = rand(PROGRESSION_MEMBERS, PROGRESSION_MEMBERS);
            var step = rand(BOTTOM_LIMIT, PROGRESSION_STEP);
            var current = rand(PROGRESSION_START);
            var hiddenElementIndex = rand(BOTTOM_LIMIT, progressionLength);
            var hiddenElementValue = -1;
            String progression = "";
            for (int j = 1; j < progressionLength + 1; j++) {
                current += step;
                if (j == hiddenElementIndex) {
                    hiddenElementValue = current;
                    progression += " " + "..";
                } else {
                    progression += " " + current;
                }
            }
            questionsAndAnswers[i][QUESTION] = progression.trim();
            questionsAndAnswers[i][ANSWER] = String.valueOf(hiddenElementValue);
        }
        Engine.runGame(CONDITION, questionsAndAnswers);
    }
}
