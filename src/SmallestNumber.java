import java.util.Scanner;

public class SmallestNumber {
    public static int askInt(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println(input);
        return sc.nextInt();
    }
    public static double askDouble(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println(input);
        return sc.nextDouble();
    }
    public static void main(String[] args) {
        int size = askInt("How many numbers?");
        double[] numbers = new double[size];
        for(int i = 0; i < size; i++) {
            askDouble("What is the number at index "+i);
        }
        double smallest = numbers[0];
        for(int i = 1; i < size; i++) {
            if(numbers[i]<smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is "+smallest);

    }
}
