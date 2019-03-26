import java.util.Scanner;
public class C3PA2 {
    public static void println(String input) {
        System.out.println(input);
    }
    public static void print(String input) {
        System.out.print(input);
    }
    public static void main( String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Enter your first name > ");
        String name = sc.next();
        println("Hello, " + name);
        println("Your name has " + name.length() + " letters.");
        print("\n");
        println("In what year were you born?");
        int yearBorn = sc.nextInt();
        println("This year, you will be " + (2019 - yearBorn) + " years old.");
        println("So far, you have lived " + (2019 - yearBorn));

    }
}
