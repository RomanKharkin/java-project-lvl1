package hexlet.code;

public class Games {
    private static int rand(int limitBottom, int limitTop) {
        return (int) (limitBottom + Math.random() * limitTop);
    }

    public static void even() {
        Boolean isAllCorrect = true;
        Cli.greet();
        Cli.outText("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String answer = "";
        var numberOfAttempts = 3; //Количество правильных ответов для победы

        for (int i = 0; i < numberOfAttempts; i++) {
            var num = rand(1, 100);
            String correctAnswer = "no";
            if (num % 2 == 0) {
                correctAnswer = "yes";
            }
            answer = Cli.request("Question: " + num);
            if (answer.equals(correctAnswer)) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + ".\n" + "Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (isAllCorrect) {
            Cli.outText("Congratulations, " + Cli.getName() + "!");
        }
    }

    public static void calc() {
        Boolean isAllCorrect = true;
        String name = Cli.request("Welcome to the Brain Games!\nMay I have your name?");
        String answer = "";
        Cli.outText("Hello, " + name + "!\n" + "What is the result of the expression?");
        var numberOfAttempts = 3; //Количество правильных ответов для победы
        String symbol = "";

        for (int i = 0; i < numberOfAttempts; i++) {
            var rand1 = rand(1, 100);
            var rand2 = rand(1, 100);
            var rand = rand(1, 3);
            var result = -1000;
            switch (rand) {
                case 1: {
                    result = rand1 + rand2;
                    symbol = " + ";
                    break;
                }
                case 2: {
                    symbol = " - ";
                    result = rand1 - rand2;
                    break;
                }
                case 3: {
                    symbol = " * ";
                    result = rand1 * rand2;
                    break;
                }
            }
            String correctAnswer = "" + result;
            answer = Cli.request("Question: " + rand1 + symbol + rand2);
            if (answer.equals(correctAnswer)) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + ".\n" + "Let's try again, " + name + "!");
                break;
            }
        }
        if (isAllCorrect) {
            Cli.outText("Congratulations, " + name + "!");
        }
    }

    public static void GCD() {
        Boolean isAllCorrect = true;
        String name = Cli.request("Welcome to the Brain Games!\nMay I have your name?");
        String answer = "";
        Cli.outText("Hello, " + name + "!\n" + "What is the result of the expression?");
        var numberOfAttempts = 3; //Количество правильных ответов для победы
        String symbol = "";

        for (int i = 0; i < numberOfAttempts; i++) {
            var rand1 = rand(1, 100);
            var rand2 = rand(1, 100);
            var result = -1;
            for (int j = 100; j > 0; j--) {
                if (rand1 % j == 0 && rand2 % j == 0) {
                    result = j;
                    break;
                }
            }
            String correctAnswer = "" + result;
            answer = Cli.request("Question: " + rand1 + " " + rand2);
            if (answer.equals(correctAnswer)) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + ".\n" + "Let's try again, " + name + "!");
                break;
            }
        }
        if (isAllCorrect) {
            Cli.outText("Congratulations, " + name + "!");
        }
    }

    public static void Progression() {
        Boolean isAllCorrect = true;
        String name = Cli.request("Welcome to the Brain Games!\nMay I have your name?");
        String answer = "";
        Cli.outText("Hello, " + name + "!\n" + "What number is missing in the progression?");
        var numberOfAttempts = 3; //Количество правильных ответов для победы
        String symbol = "";

        for (int i = 0; i < numberOfAttempts; i++) {
            var number = rand(5, 5);
            var step = rand(1,10);
            var start = rand(1,15);
            var pass = rand(1, number);
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
            answer = Cli.request("Question: " + progression);
            if (answer.equals(correctAnswer)) {
                Cli.outText("Correct!");
            } else {
                isAllCorrect = false;
                Cli.outText("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'" + ".\n" + "Let's try again, " + name + "!");
                break;
            }
        }
        if (isAllCorrect) {
            Cli.outText("Congratulations, " + name + "!");
        }
    }
}
