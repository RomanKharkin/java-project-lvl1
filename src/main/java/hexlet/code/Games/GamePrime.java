package hexlet.code.Games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.QUESTIONS_ANSWERS;
import static hexlet.code.Games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Games.Rand.BOTTOM_LIMIT;
import static hexlet.code.Games.Rand.rand;

public class GamePrime {
    public static final int TOP_LIMIT_PRIME = 20;
    public static void prime() {
        String[] game = new String[QUESTIONS_ANSWERS];
        game[0] = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var num = rand(BOTTOM_LIMIT, TOP_LIMIT_PRIME);
            game[i + ANSWERS] = "yes";
            for (int j = 2; j < num; j++) {
                if (num % j == 0) {
                    game[i + ANSWERS] = "no";
                }
            }
            if (num == 2) {
                game[i + ANSWERS] = "no";
            }
            game[i + QUESTIONS] = "" + num;
        }
        Engine.play(game);
    }
}
