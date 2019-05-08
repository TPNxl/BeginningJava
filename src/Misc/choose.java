package Misc;

import java.util.Scanner;

public class choose {
    public static long factorial(long input) {
        long result = 1;
        if(input <= 0) {
            return 1;
        }
        else {
            while(input > 0) {
                result*=input;
                input--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter degree");
        int degree = sc.nextInt();
        for(int i = 0; i <= degree; i++) {
            long coefficient = 1;
            coefficient = factorial(degree)/(factorial((i))*(factorial(degree-i)));
            coefficient = coefficient*((long)Math.pow(a,degree-i) * (long)Math.pow(b,i));
            if(!(coefficient == 1)) {
                if(coefficient == -1) { System.out.print("-"); }
                else { System.out.print(coefficient); }

            }
            if(degree-i != 0) {
                if(degree-i == 1) {
                    System.out.print("x");
                }
                else {
                    System.out.print("x^");
                    System.out.print(degree-i);
                }
            }
            if(i != 0) {
                if(i == 1) {
                    System.out.print("y");
                }
                else {
                    System.out.print("y^");
                    System.out.print(i);
                }
            }
            if(i != degree) {
                System.out.print(" + ");
            }
        }
    }

}
