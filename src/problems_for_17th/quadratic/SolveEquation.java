package problems_for_17th.quadratic;

// Client class for quadratic

import java.util.Scanner;

public class SolveEquation {
    private static void print(String input) {
        System.out.print(input);
    }
    private static String ask(String input) {
        Scanner sc = new Scanner(System.in);
        System.out.println(input);
        return sc.next();
    }
    public static void main(String[] args) {
        double a = Double.parseDouble(ask("Enter a"));
        double b = Double.parseDouble(ask("Enter b"));
        double c = Double.parseDouble(ask("Enter c"));
        Quadratic q = new Quadratic(a,b,c);
        if(q.a() == 0) {
            print("The linear equation has one real root");
        } else {
            print("The quadratic has ");
        }
        if(q.a() == 0) {
            print("\n");
        } else if(q.disc() == 0) {
            print("two identical real root\n");
        } else if(q.disc() > 0) {
            print("two real roots\n");
        } else if(q.disc() < 0) {
            print("two complex roots\n");
        }
        print("The roots are: \n" + q.roots());
    }
}
