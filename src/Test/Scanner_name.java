package Test;
import java.util.Scanner;
public class Scanner_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = sc.next();
        System.out.println("Your name is "+name);
    }
}
