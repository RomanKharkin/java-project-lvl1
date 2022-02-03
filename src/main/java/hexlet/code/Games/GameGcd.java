package hexlet.code.Games;
import hexlet.code.Cli;

import static hexlet.code.Games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Games.Rand.BOTTOM_LIMIT;
import static hexlet.code.Games.Rand.TOP_LIMIT;
import static hexlet.code.Games.Rand.rand;

public class GameGcd {
    public static void gcd() {
        Boolean isAllCorrect = true;
        Cli.greet();
        String answer = "";
        Cli.outText("Find the greatest common divisor of given numbers.");

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
            String correctAnswer = "" + result;
            answer = Cli.request("Question: " + rand1 + " " + rand2 + "\nYour answer: ");
            if (answer.equals(correctAnswer)) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + correctAnswer + "'" + ".\n" + "Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (isAllCorrect) {
            Cli.outText("Congratulations, " + Cli.getName() + "!");
        }
    }
}
