package hexlet.code;

import static hexlet.code.Games.Rand.NUMBER_CORRECT_ANSWER;

public class Engine {
    public static final int QUESTIONS_ANSWERS = 7;
    public static final int QUESTIONS = 1;                  // i + 1
    public static final int ANSWERS = 4;                    // i + 4


    public static void play(String[] game) {
        Boolean isAllCorrect = true;
        Cli.greet();
        Cli.outText(game[0]);
        String answer = "";

        for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {

            answer = Cli.request("Question: " + game[i + QUESTIONS] + "\nYour answer: ").toLowerCase();
            if (answer.equals(game[i + ANSWERS])) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + game[i + ANSWERS] + "'" + ".\n" + "Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (isAllCorrect) {
            Cli.outText("Congratulations, " + Cli.getName() + "!");
        }
    }
}
