package hexlet.code;

public class Game {
    public static void even() {

        Boolean isAllCorrect = true;
        String name = Cli.request1("Welcome to the Brain Games!\nMay I have your name?");
        String answer = "";
        Cli.outText("Hello, " + name + "!\n" + "Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            var rand = (int) (1 + Math.random() * 100);
            String correctAnswer = "no";
            if (rand % 2 == 0) {
                correctAnswer = "yes";
            }
            answer = Cli.request1("Question: " + rand);
            if (answer.equals(correctAnswer)) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + ".\n" +
                        "Let's try again, " + name + "!");
                break;
            }
        }
        if(isAllCorrect) {
            Cli.outText("Congratulations, " + name + "!");
        }
    }
}