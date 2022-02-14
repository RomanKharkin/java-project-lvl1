package hexlet.code.Games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWERS;
import static hexlet.code.Engine.QUESTIONS;
import static hexlet.code.Engine.QUESTIONS_ANSWERS;
import static hexlet.code.Games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Games.Rand.rand;
import static hexlet.code.Games.Rand.BOTTOM_LIMIT;
import static hexlet.code.Games.Rand.TOP_LIMIT;


public class GameEven {
    public static void even() {
        String[] game = new String[QUESTIONS_ANSWERS];
        game[0] = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var num = rand(BOTTOM_LIMIT, TOP_LIMIT);
            game[i + QUESTIONS] = "" + num;
            game[i + ANSWERS] = "no";
            if (num % 2 == 0) {
                game[i + ANSWERS] = "yes";
            }
        }
        Engine.play(game);
    }
}
