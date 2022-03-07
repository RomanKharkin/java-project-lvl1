package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.COUPLE_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.LINES_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Utils.BOTTOM_LIMIT;
import static hexlet.code.Utils.TOP_LIMIT;
import static hexlet.code.Utils.rand;

public class GameEven {
    public static final String CONDITION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        String[][] questionsAndAnswers = new String[LINES_QUESTIONS_ANSWERS][COUPLE_QUESTIONS_ANSWERS];

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var num = rand(BOTTOM_LIMIT, TOP_LIMIT);
            questionsAndAnswers[i][QUESTIONS] = "" + num;
            questionsAndAnswers[i][ANSWERS] = num % 2 == 0 ? "yes" : "no";
        }
        Engine.runGame(CONDITION, questionsAndAnswers);
    }
}
