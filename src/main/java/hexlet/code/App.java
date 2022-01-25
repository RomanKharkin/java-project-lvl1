package hexlet.code;

public class App {
    public static void main(String[] args) {
        String n = "";
        search:
        {
            while (!"0".equals(n)) {
                n = Cli.request("Please enter the game number and press Enter.\n"
                        + "1 - Greet\n" + "2 - Even\n" + "3 - Calc\n" + "4 - GCD\n" + "5 - Progression\n" + "0 - Exit");
                Cli.outText("Your choice: " + n);
                switch (n) {
                    case "1": {
                        Cli.greet();
                        break search;
                    }
                    case "2": {
                        Games.even();
                        break search;
                    }
                    case "3": {
                        Games.calc();
                        break search;
                    }
                    case "4": {
                        Games.GCD();
                        break search;
                    }
                    case "5": {
                        Games.Progression();
                        break search;
                    }
                    case "0": {
                        Cli.outText("Exit");
                        break search;
                    }
                }
            }
        }
    }
}
