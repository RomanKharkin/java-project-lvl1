package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.COUPLE_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.LINES_QUESTIONS_ANSWERS;
import static hexlet.code.Engine.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Utils.rand;

public class GamePrime {
    public static final int TOP_LIMIT_PRIME = 20;
    public static final int BOTTOM_LIMIT_PRIME = 2;
    public static final String CONDITION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {
        String[][] questionsAndAnswers = new String[LINES_QUESTIONS_ANSWERS][COUPLE_QUESTIONS_ANSWERS];

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var number = rand(BOTTOM_LIMIT_PRIME, TOP_LIMIT_PRIME);
            questionsAndAnswers[i][QUESTION] = String.valueOf(number);
            questionsAndAnswers[i][ANSWER] = isPrime(number) ? "yes" : "no";
        }
        Engine.runGame(CONDITION, questionsAndAnswers);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
