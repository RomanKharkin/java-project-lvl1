package hexlet.code.Games;

public class Rand {
    public static int rand(int limitBottom, int limitTop) {
        return (int) (limitBottom + Math.random() * limitTop);
    }
    public static final int NUMBER_CORRECT_ANSWER = 3; //Количество правильных ответов для победы
    public static final int TOP_LIMIT = 100;
    public static final int BOTTOM_LIMIT = 1;
}
