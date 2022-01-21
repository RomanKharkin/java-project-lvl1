package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void request() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    public static String request1(String requestLabel) {
        System.out.println(requestLabel);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static void outText(String text) {
        System.out.println(text);
    }
}
