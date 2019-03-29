/*
Timmy Nadolsky
Scratchbook

 */

public class Scratchbook {
    public static void print(String input) { System.out.print(input);}
    public static void main( String[] args) {
        int size = 3;
        print("+");
        for(int i = 0; i < size; i++) {
            print("**");
        }
        print("+\n");
        for(int i = 0; i < size; i++) {
            print("|");
            for(int j = 0; j < size - i; j++) {
                print(" ");
            }
            print("/");
            for(int j = i; j > 0; j++) {
                print(" ");
            }
            print("\\");
            for(int j = 0; j < size - i; j++) {
                print(" ");
            }
            print("|\n");
        }

    }
}
