package hexlet.code;

public class App {
    public static String reverse(String input) {
        var reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }
}
