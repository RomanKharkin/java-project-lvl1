package hexlet.code.Games;
import hexlet.code.Cli;

import static hexlet.code.Games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Games.Rand.BOTTOM_LIMIT;
import static hexlet.code.Games.Rand.TOP_LIMIT;
import static hexlet.code.Games.Rand.rand;

public class GameEven {
    public static void even() {
        Boolean isAllCorrect = true;
        Cli.greet();
        Cli.outText("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String answer = "";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var num = rand(BOTTOM_LIMIT, TOP_LIMIT);
            String correctAnswer = "no";
            if (num % 2 == 0) {
                correctAnswer = "yes";
            }
            answer = Cli.request("Question: " + num + "\nYour answer: ").toLowerCase();
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
