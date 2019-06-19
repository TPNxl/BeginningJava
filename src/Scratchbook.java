import java.io.IOException;

public class Scratchbook {
    public static void print(String input) { System.out.print(input);}
    public static void main( String[] args) throws IOException {
        String s = Integer.toString(System.in.read());
        print(s);

    }
}
