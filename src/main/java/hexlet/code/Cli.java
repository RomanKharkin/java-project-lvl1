package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void request() {
        System.out.println("Welcome to the Brain Games!\nMay I have your name?");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, " + sc.nextLine() + "!");
    }
}