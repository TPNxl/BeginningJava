import java.io.IOException;

public class Scratchbook {
    public static void print(String input) { System.out.print(input);}
    public static void main( String[] args) throws IOException {
        String n = " askldjlaksjkldjklgjehlwfhi ";
        try {
            Double.valueOf(n);
        } catch (NumberFormatException identifier) {
            print("Invalid number");
        }
    }
}
