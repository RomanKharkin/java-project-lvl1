package hexlet.code;

import static hexlet.code.games.Rand.NUMBER_CORRECT_ANSWER;

public class Engine {
    public static final int QUESTIONS_ANSWERS = 3;
    public static final int QUESTIONS = 0;
    public static final int ANSWERS = 1;


    public static void initGame(String condition, String[][] game) {
        Boolean isAllCorrect = true;
        Cli.greet();
        Cli.outText(condition);
        String answer = "";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {

            answer = Cli.request("Question: " + game[QUESTIONS][i] + "\nYour answer: ").toLowerCase();
            if (answer.equals(game[ANSWERS][i])) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + game[ANSWERS][i] + "'" + ".\n" + "Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (isAllCorrect) {
            Cli.outText("Congratulations, " + Cli.getName() + "!");
        }
    }
}
