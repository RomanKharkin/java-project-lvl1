package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static String greet() {
        System.out.print("Welcome to the Brain Games!\nMay I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
