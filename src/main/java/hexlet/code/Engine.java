package hexlet.code;

public class Engine {
    public static final int NUMBER_CORRECT_ANSWER = 3; //Количество правильных ответов для победы
    public static final int COUPLE_QUESTIONS_ANSWERS = 2;
    public static final int LINES_QUESTIONS_ANSWERS = 3;
    public static final int QUESTIONS = 0;
    public static final int ANSWERS = 1;



    public static void runGame(String condition, String[][] questionsAndAnswers) {
        Boolean isAllCorrect = true;
        Cli.greet();
        Cli.outText(condition);
        String answer = "";

        //for (int i = 0; i < NUMBER_CORRECT_ANSWER; i++) {
        for (String[] questionAndAnswer: questionsAndAnswers) {

            answer = Cli.request("Question: " + questionAndAnswer[QUESTIONS] + "\nYour answer: ").toLowerCase();

            if (answer.equals(questionAndAnswer[ANSWERS])) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + questionAndAnswer[ANSWERS] + "'" + ".\n" + "Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        Cli.outText("Congratulations, " + Cli.getName() + "!");
    }
}
