import java.util.Scanner;

public class grocery {
    public static void print(String input) { System.out.print(input);}
    public static void main(String[] args) {
        print("Welcome to the \"Scanner\"\n");
        int i = 1;
        double total = 0.0;
        Scanner sc = new Scanner(System.in);
        print("Do you have something to scan (y/n)? ");
        if(sc.next().toLowerCase().charAt(0) == 'y') {
            while(true) {
                if(i == 1) {
                    print("Please enter the price of the first item > ");
                } else {
                    print("Please enter the price of the next item > ");
                }
                total += sc.nextDouble();
                print("Do you have another item to scan (y/n)? ");
                if (!(sc.next().toLowerCase().charAt(0) == 'y')) {
                    break;
                } else {
                    i++;
                }
            }
            System.out.printf("Your total price for %d items is $%.2f", i, total);
            System.exit(0);
        } else {
            System.exit(0);
        }

    }
}
