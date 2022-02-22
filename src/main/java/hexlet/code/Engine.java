package hexlet.code;

import static hexlet.code.Utils.NUMBER_CORRECT_ANSWER;

public class Engine {
    public static final int COUPLE_QUESTIONS_ANSWERS = 2;
    public static final int LINES_QUESTIONS_ANSWERS = 3;
    public static final int QUESTIONS = 0;
    public static final int ANSWERS = 1;


    public static void initGame(String condition, String[][] game) {
        Boolean isAllCorrect = true;
        Cli.greet();
        Cli.outText(condition);
        String answer = "";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {

            answer = Cli.request("Question: " + game[i][QUESTIONS] + "\nYour answer: ").toLowerCase();
            if (answer.equals(game[i][ANSWERS])) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + game[i][ANSWERS] + "'" + ".\n" + "Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (isAllCorrect) {
            Cli.outText("Congratulations, " + Cli.getName() + "!");
        }
    }
}
