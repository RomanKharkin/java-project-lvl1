package hexlet.code.Games;

import hexlet.code.Cli;

import static hexlet.code.Games.Rand.NUMBER_CORRECT_ANSWER;
import static hexlet.code.Games.Rand.BOTTOM_LIMIT;
import static hexlet.code.Games.Rand.rand;

public class GameProgression {
    public static final int PROGRESSION_STEP = 10;
    public static final int PROGRESSION_START = 15;
    public static final int PROGRESSION_MEMBERS = 5;
    public static void progression() {
        Boolean isAllCorrect = true;
        Cli.greet();
        String answer = "";
        Cli.outText("What number is missing in the progression?");

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
            var number = rand(PROGRESSION_MEMBERS, PROGRESSION_MEMBERS);
            var step = rand(BOTTOM_LIMIT, PROGRESSION_STEP);
            var start = rand(BOTTOM_LIMIT, PROGRESSION_START);
            var pass = rand(BOTTOM_LIMIT,  number);
            var result = -1;
            String progression = "";
            for (int j = 1; j < number + 1; j++) {
                start += step;
                if (j == pass) {
                    result = start;
                    progression += " " + "..";
                } else {
                    progression += " " + start;
                }
            }
            String correctAnswer = "" + result;
            answer = Cli.request("Question: " + progression + "\nYour answer: ");
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
