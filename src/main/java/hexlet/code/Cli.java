package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name = "Default name";

    public static void greet() {
        name = request("Welcome to the Brain Games!\nMay I have your name?");
        Cli.outText("Hello, " + name + "!");
    }

    public static String request(String requestLabel) {
        System.out.println(requestLabel);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void outText(String text) {
        System.out.println(text);
    }

    public static String getName() {
        return name;
    }
}
