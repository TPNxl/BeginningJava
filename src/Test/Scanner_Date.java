package Test;

import java.util.Scanner;

public class Scanner_Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date > ");
        String date = sc.nextLine(); // Month dd, yyyy
        sc.close();
        System.out.println("The first letter in the month is "+ date.charAt(0));
        System.out.println("The date in all lowercase letters is "+date.toLowerCase());
        String year = date.substring(date.indexOf(',') + 2);
        System.out.println("The year is "+year);
    }
}
