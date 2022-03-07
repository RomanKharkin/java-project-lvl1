package hexlet.code;

public class Utils {
    public static int rand(int limitBottom, int limitTop) {
        return (int) (limitBottom + Math.random() * limitTop);
    }
    public static final int TOP_LIMIT = 100;
    public static final int BOTTOM_LIMIT = 1;
}
