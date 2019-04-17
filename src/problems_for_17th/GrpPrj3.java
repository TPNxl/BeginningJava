package problems_for_17th;

// Group project 3

import java.text.DecimalFormat;
import java.util.Scanner;

public class GrpPrj3 {
    public static String ask(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        return sc.next();
    }
    public static void main(String[] args) {
        double IR = Double.valueOf(ask("Enter the current interest rate (annual)."));
        double mIR = IR/12;
        int nOY = Integer.valueOf(ask("Enter the number of years."));
        double M = Double.valueOf(ask("How much is borrowed in $?"));
        DecimalFormat df = new DecimalFormat( "#.##" );
        System.out.println("The percent of interest is " + IR*100 + "% per year");
        System.out.println("The amount of $ borrowed is $" + M);
        double monthly = (mIR*M)/(1-(1/Math.pow((1+mIR),(12*nOY))));
        System.out.println(monthly);
        System.out.println("The monthly payment is $"+ df.format(monthly));
        System.out.println("The total payment is $"+ df.format(nOY*monthly*12));
        System.out.println("The overpayment is $"+ df.format((nOY*monthly*12)-M));
        System.out.println("The overpayment % is "+(((nOY*monthly*12)/M)-1)*100 + "%");
    }
}
