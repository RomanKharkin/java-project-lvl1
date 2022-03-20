package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_CORRECT_ANSWER = 3; //Количество правильных ответов для победы
    public static final int COUPLE_QUESTIONS_ANSWERS = 2;
    public static final int LINES_QUESTIONS_ANSWERS = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;



    public static void runGame(String condition, String[][] questionsAndAnswers) {
        Cli.greet();
        System.out.println(condition);

        for (String[] questionAndAnswer: questionsAndAnswers) {
            String answer = "";
            System.out.print("Question: " + questionAndAnswer[QUESTION] + "\nYour answer: ");
            Scanner sc = new Scanner(System.in);
            answer = sc.nextLine().toLowerCase();

            if (answer.equals(questionAndAnswer[ANSWER])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + questionAndAnswer[ANSWER] + "'" + ".\n" + "Let's try again, " + Cli.getName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
