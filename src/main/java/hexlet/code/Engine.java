package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int NUMBER_CORRECT_ANSWERS = 3; //Количество правильных ответов для победы
    public static final int COUPLE_QUESTIONS_ANSWERS = 2;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;


    public static void runGame(String condition, String[][] questionsAndAnswers) {
        String name = greet();
        System.out.println(condition);

        for (String[] questionAndAnswer: questionsAndAnswers) {
            System.out.print("Question: " + questionAndAnswer[QUESTION] + "\nYour answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine().toLowerCase();

            if (answer.equals(questionAndAnswer[ANSWER])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'"
                        + questionAndAnswer[ANSWER] + "'" + ".\n" + "Let's try again, " + name + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + name + "!");
    }

    public static String greet() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
