package hexlet.code;


import hexlet.code.games.GameCalc;
import hexlet.code.games.GameEven;
import hexlet.code.games.GameGcd;
import hexlet.code.games.GameProgression;
import hexlet.code.games.GamePrime;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        String n = "";
        while (!"0".equals(n)) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("4 - GCD");
            System.out.println("5 - Progression");
            System.out.println("6 - Prime");
            System.out.println("0 - Exit");

            System.out.print("Your choice: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextLine();
            switch (n) {
                case "1":
                    Cli.greet();
                    return;
                case "2":
                    GameEven.play();
                    return;
                case "3":
                    GameCalc.play();
                    return;
                case "4":
                    GameGcd.play();
                    return;
                case "5":
                    GameProgression.play();
                    return;
                case "6":
                    GamePrime.play();
                    return;
                case "0":
                    System.out.println("Exit");
                    return;
                default: System.out.println("Error");
            }
        }
    }
}
