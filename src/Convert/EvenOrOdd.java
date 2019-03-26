/*
Timmy Nadolsky
Even or od
Declare 5 variables (int, byte, short, long)
Find out which ones are even
Print the result
 */
package Convert;
import java.util.Scanner;

public class EvenOrOdd {
    public static String evenOrOdd(int input) {
        if(input%2==0) {
            return("even");
        }
        else {
            return("odd");
        }
    }
    public static void main(String[] args){
        // Declare variables
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);

        // Enter values for integers
        System.out.println("Enter four integers.");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        // Find out if numbers are even and print the result
        System.out.print(a + " is " + evenOrOdd(a) + ", ");
        System.out.print(b + " is " + evenOrOdd(b) + ", ");
        System.out.print(c + " is " + evenOrOdd(c) + ", ");
        System.out.print("and " + d + " is " + evenOrOdd(a) + ", ");
        System.exit(0);
    }
}
