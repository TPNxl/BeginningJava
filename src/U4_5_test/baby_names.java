package U4_5_test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class baby_names {

    private static final File names = new File("C:\\Users\\timmy\\Documents\\GitHub\\BeginningJava\\src\\U4_5_test\\names.txt");
    private static void print(String input) { System.out.print(input);}
    private static void println(String input) { System.out.print(input+"\n");}

    // Code starts here
    private static void a() throws IOException{ // Problem A
        Scanner n = new Scanner(names);
        Scanner sc = new Scanner(System.in);
        println("What name do you want to lookup?");
        String search = sc.next();
        try {
            // Check the first name, else check all other names
            if(!(search.equals(n.next()))) {
                n.findWithinHorizon("\n"+search+" ", 2147483646);
            } // If found print the results
            for(int year = 1900; year <= 2000; year += 10) {
                println("There were "+n.next() + " babies named "+search+" in "+year+".");
            }
        }
        catch (NullPointerException npe) { // Catch exceptions if the name isn't found
            println("Can't find name");
        }

    }
    private static void b() throws IOException { // Problem B
        Scanner n = new Scanner(names);
        println("On average,");
        while(n.hasNext() && n.hasNextLine()) {
            Scanner n2 = new Scanner(n.nextLine());
            // Get the name
            String name = n2.next();
            // Find the average
            int i = 0;
            double average = 0.0;
            while(n2.hasNextDouble()) {
                i++;
                average+=n2.nextDouble();
            }
            average/=i;
            // Print the results
            System.out.printf("%.0f babies were named %s per decade\n", average, name);
        }
    }
    private static void d() throws IOException { // Problem D
        Scanner n = new Scanner(names);
        int max = 0;
        String maxName = "";
        // Find the max value
        while(n.hasNextLine() && n.hasNext()) {
            Scanner n3 = new Scanner(n.nextLine());
            String name = n3.next();
            for(int i = 0; i < 4; i++) {
                n3.next();
            }
            int amount = n3.nextInt();
            if(amount > max) {
                max = amount;
                maxName = name;
            }
        }
        // Print the result
        println("The most popular baby name in 1940 was "+maxName +", with "+max+" usages");
    }
    private static void e() throws IOException { // Problem E
        Scanner n = new Scanner(names);
        String maxName = "";
        println("In 1900, 58 babies were named: ");
        while(n.hasNextLine() && n.hasNext()) {
            // Find the name
            Scanner x = new Scanner(n.nextLine());
            maxName = x.next();
            // If 58 babies were named maxName in 1900, print the result
            if(x.nextInt() == 58) {
                println("- "+maxName);
            }
        }
    }
    public static void main(String[] args) throws IOException { // Selector
        Scanner sc = new Scanner(System.in);
        println("Enter the problem you want to run.");
        while(true) {
            String input = sc.next().toLowerCase();
            switch(input) {
                case "a":
                    a();
                    break;
                case "b":
                    b();
                    break;
                case "d":
                    d();
                    break;
                case "e":
                    e();
                    break;
                default:
                    print("Program not found");
                    break;
            }
            println("\nEnter the problem you want to run.");
        }

    }
}
