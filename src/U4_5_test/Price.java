package U4_5_test;

import java.util.Scanner;

public class Price {
    private static void print(String input) { System.out.print(input);}
    private static void println(String input) { System.out.print(input+"\n");}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double total = 0.0;
        boolean finished = false;
        do {
            println("Enter a price");
            String input = sc.next();
            if(!(input.equalsIgnoreCase("no"))) {
                total = Double.valueOf(input);
                i++;
            } else {
                finished = true;
            }
        } while(!finished);
        System.out.printf("You purchased %d items and the total is $%.2f", i, total);
    }
}
