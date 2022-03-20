package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name = "Default name";

    public static void greet() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
