package U4_5_test;

import java.util.Scanner;

public class Price {
    public static void println(String input) {
        System.out.println(input);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double total = 0.0;
        println("Enter the price of an item, enter \"no\" to stop");
        do {
            String input = sc.next();
            if(!(input.equalsIgnoreCase("no"))) {
                try {
                    total += Double.valueOf(input);
                    i++;
                }
                catch (NumberFormatException nfe) {
                    println("Invalid input");
                }
            } else {
                break;
            }
        } while(true);
        System.out.printf("You purchased %d items and the total is $%.2f", i, total);
    }
}
