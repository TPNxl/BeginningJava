package Misc;

import java.util.Scanner;

public class SmallestNumber {
    private static int askInt(String input) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println(input);
            if(sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                sc.next();
                System.out.println("Invalid input");
            }
        }
    }
    private static double askDouble(String input) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println(input);
            if(sc.hasNextDouble()) {
                return sc.nextDouble();
            } else {
                sc.next();
                System.out.println("Invalid input");
            }
        }
    }
    public static double smallestArrayValue(double[] array) {
        double smallest = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i]<smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
    public static String posSuffix(int i) {
        if(i == 1) {
            return "1st";
        } else if (i == 2) {
            return "2nd";
        } else if (i == 3) {
            return "3rd";
        } else if (i > 0) {
            return i+"th";
        } else {
            return "ERROR";
        }
    }
    public static void main(String[] args) {
        int size;
        while(true) {
            size = askInt("How many numbers?");
            if(size<=0) {
                System.out.println("Invalid input");
            } else {
                break;
            }
        }
        double[] numbers = new double[size];
        for(int i = 0; i < size; i++) {
            numbers[i] = askDouble("What is the "+ posSuffix(i+1)+ " number?");
        }
        System.out.println("The smallest number is "+smallestArrayValue(numbers));
    }
}
