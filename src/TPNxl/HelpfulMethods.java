package TPNxl;
import java.util.Scanner;

public class HelpfulMethods {
    public static String ask(String input, boolean line) {
        Scanner sc = new Scanner(System.in);
        if(line = true) {
            System.out.println(input);
        }
        else {
            System.out.print(input);
        }
        return sc.next();
    }
}
