import java.util.Scanner;

public class gangstaName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your name, playa: ");
        String input = sc.nextLine();
        sc.close();
        String firstName = input.substring(0, input.indexOf(" "));
        String lastName = input.substring(input.indexOf(" ")+1);
        System.out.println("Your gangsta name is \"" + firstName.charAt(0) + ". Diddy "+lastName.toUpperCase() + " " + firstName + "-izzle\"");
    }
}
