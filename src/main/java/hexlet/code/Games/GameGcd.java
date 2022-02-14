package hexlet.code.Games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.QUESTIONS_ANSWERS;
import static hexlet.code.Games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Games.Rand.BOTTOM_LIMIT;
import static hexlet.code.Games.Rand.TOP_LIMIT;
import static hexlet.code.Games.Rand.rand;


public class GameGcd {
    public static void gcd() {
        String[] game = new String[QUESTIONS_ANSWERS];
        game[0] = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var rand1 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            var rand2 = rand(BOTTOM_LIMIT, TOP_LIMIT);
            var result = -1;
            for (int j = TOP_LIMIT; j > 0; j--) {
                if (rand1 % j == 0 && rand2 % j == 0) {
                    result = j;
                    break;
                }
            }
            game[i + QUESTIONS] = rand1 + " " + rand2;
            game[i + ANSWERS] = "" + result;
        }
        Engine.play(game);
    }
}
