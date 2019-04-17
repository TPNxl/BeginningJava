package Misc;

import java.util.Scanner;

public class SumNumbers {
    private static int askInt(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println(input);
        return sc.nextInt();
    }
    public static void main(String[] args) {
        int a =  askInt("Enter a number.");
        int b =  askInt("Enter another number.");
        int low = Math.min(a,b);
        int high = Math.max(a,b);
        int sum = 0;
        for (int i = low; i <= high; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}