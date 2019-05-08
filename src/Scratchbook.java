import java.io.IOException;
import java.util.Scanner;

public class Scratchbook {
    public static void print(String input) { System.out.print(input);}
    public static void main( String[] args) throws IOException {
        String x = "Hello my name is kaden blahblahalbalhla kaden asdidsjlkjskjl kaden";
        String y = "kaden";
        Scanner sc = new Scanner(x);
        print(sc.findWithinHorizon(y,4) + "\n");
        print(sc.next() + "\n");
        print(sc.findWithinHorizon(y,99) + "\n");
        print(sc.next() + "\n");
        print(sc.findWithinHorizon(y,99) + "\n");
        print(sc.next());

    }
}
