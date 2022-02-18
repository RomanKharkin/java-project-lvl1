package hexlet.code;


import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGcd;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrime;


public class App {

    public static void main(String[] args) {
        String n = "";
        while (!"0".equals(n)) {
            Cli.outText("Please enter the game number and press Enter.");
            Cli.outText("1 - Greet");
            Cli.outText("2 - Even");
            Cli.outText("3 - Calc");
            Cli.outText("4 - GCD");
            Cli.outText("5 - Progression");
            Cli.outText("6 - Prime");
            Cli.outText("0 - Exit");

            n = Cli.request("Your choice: ");
            switch (n) {
                case "1":
                    Cli.greet();
                    return;
                case "2":
                    GameEven.even();
                    return;
                case "3":
                    GameCalc.calc();
                    return;
                case "4":
                    GameGcd.gcd();
                    return;
                case "5":
                    GameProgression.progression();
                    return;
                case "6":
                    GamePrime.prime();
                    return;
                case "0":
                    Cli.outText("Exit");
                    return;
                default: Cli.outText("Error");
            }
        }
    }
}
