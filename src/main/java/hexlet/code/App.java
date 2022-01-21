package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = "";
        while (!"0".equals(n)) {
            System.out.println("Please enter the game number and press Enter.\n" + "1 - Greet\n" + "2 - Even\n"+ "0 - Exit");
            n = sc.nextLine();
            if (n.equals("0")) {
                System.out.println("Your choice: 0" + "\n" + "Exit");
            } else if (n.equals("1")) {
                System.out.println("Your choice: 1" + "\n");
                Cli.request();
                break;
            } else if (n.equals("2")) {
                System.out.println("Your choice: 2" + "\n");
                Game.even();
                break;
            }
        }
    }
}
