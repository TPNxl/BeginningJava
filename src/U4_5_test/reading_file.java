package U4_5_test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class reading_file {

    public static final File names = new File("C:\\Users\\timmy\\Documents\\GitHub\\BeginningJava\\src\\U4_5_test\\names.txt");

    private static void print(String input) { System.out.print(input);}
    private static void println(String input) { System.out.print(input);}

    public static void main(String[] args) throws IOException {
        Scanner n = new Scanner(names);
        while(n.hasNext() && n.hasNextLine()) {
            // Your code here
        }
        n.close();
    }
}
