import java.util.Scanner;

public class calculator {
    public static void print(String input) { System.out.print(input);}
    public static void main(String[] args) {
        double fp1, fp2;
        String operation;
        Scanner sc = new Scanner(System.in);
        print("Welcome to the Calculator\n");
        while(true) {
            print("Enter the first operand: ");
            fp1 = sc.nextDouble();
            print("Enter the second operand: ");
            fp2 = sc.nextDouble();
            print("Operations are: \n"
                    + "ADD or + for addition\n"
                    + "SUBTRACT or - subtraction\n"
                    + "MULTIPLY or * for multiplication\n"
                    + "DIVIDE or / for division"
                    + "MOD, MODULO or % for modulo\n");
            print("Enter your selection: ");
            operation = sc.next().toUpperCase();
            switch (operation) {
                case "ADD":
                case "+":
                    System.out.printf("The result is %.2f", fp1+fp2);
                    break;
                case "SUBTRACT":
                case "-":
                    System.out.printf("The result is %.2f", fp1-fp2);
                    break;
                case "MULTIPLY":
                case "*":
                    System.out.printf("The result is %.2f", fp1*fp2);
                    break;
                case "DIVIDE":
                case "/":
                    System.out.printf("The result is %.2f", fp1/fp2);
                    break;
                case "MOD":
                case "MODULO":
                case "%":
                    System.out.printf("The result is %.2f", fp1%fp2);
                    break;
                default:
                    print("Invalid operation");
            }
            print("\nWould you like to do another operation? ");
            String x = sc.next();
            if(!(x.equalsIgnoreCase("yes") || x.equalsIgnoreCase("y"))) {
                break;
            }
        }

    }
}