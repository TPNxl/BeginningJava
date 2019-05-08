package U4_5_test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class baby_names {

    public static final File names = new File("C:\\Users\\timmy\\Documents\\GitHub\\BeginningJava\\src\\U4_5_test\\names.txt");

    private static void print(String input) { System.out.print(input);}
    private static void println(String input) { System.out.print(input+"\n");}

    // Code starts here

    private static void a() throws IOException{
        Scanner n = new Scanner(names);
        Scanner sc = new Scanner(System.in);
        println("What name do you want to lookup?");
        String search = sc.next();
        try {
            if(!(search.equals("A"))) {
                String found = n.findWithinHorizon("\n"+search+" ", 999999999);
            }
            for(int year = 1900; year <= 2000; year += 10) {
                println("There were "+n.next() + " babies named "+search+" in "+year+".");
            }
        }
        catch (NullPointerException npe) {
            println("Can't find name");
        }

    }
    private static void b() throws IOException {
        Scanner n = new Scanner(names);
        while(n.hasNext() && n.hasNextLine()) {
            Scanner n2 = new Scanner(n.nextLine());
            String name = n2.next();
            int i = 0;
            double average = 0.0;
            while(n2.hasNextDouble()) {
                i++;
                average+=n2.nextDouble();
            }
            average/=i;
            System.out.printf("%s: %.0f babies/year\n", name, average);
        }
    }
    private static void d() throws IOException {
        Scanner n = new Scanner(names);
        int max = 0;
        String maxName = "";
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
        println("The most popular baby name in 1940 was "+maxName);
    }
    private static void e() throws IOException {
        Scanner n = new Scanner(names);
        String maxName = "";
        n = new Scanner(names);
        print("In 1900, 58 babies were named ");
        while(n.hasNextLine() && n.hasNext()) {
            Scanner x = new Scanner(n.nextLine());
            maxName = x.next();
            if(x.nextInt() == 58) {
                print(maxName+", ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(true) {
            println("\nEnter the problem you want to run.");
            String input = sc.next();
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
        }

    }
}
