/*
Timmy Nadolsky
3/20/19
Program: Circle Area

Pseudocode
1. Ask user of radius of a circle
2. Print area of a circle with the radius given
*/
package Convert;
import java.util.Scanner;
public class AreaCircle {
    public static double circleArea(double radius) {
        final double PI = 3.1415926535;
        return PI*Math.pow(radius, 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the radius of the circle? (in inches)");
        double radius = sc.nextDouble();
        System.out.println("The area of a circle with radius " + radius + " inches is " + circleArea(radius) + " square inches..");
    }
}
