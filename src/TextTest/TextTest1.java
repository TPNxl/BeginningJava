package TextTest;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TextTest1 {
    public static void print(String input) { System.out.print(input);}
    public static void main( String[] args) throws IOException {
        File file = new File("C:\\Users\\timmy\\Documents\\GitHub\\BeginningJava\\src\\TextTest\\coolfile.txt");
        Scanner f = new Scanner(file);
        int i = 0;
        while(f.hasNext()) {
            if(f.hasNextInt()) {
                i++;
            }
            f.next();
        }
        System.out.print(i);
    }
}
