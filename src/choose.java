import java.math.BigInteger;
import java.util.Scanner;

public class choose {
    public static BigInteger factorial(BigInteger input) {
        BigInteger result = new BigInteger("1");
        if(input.compareTo(BigInteger.ZERO) != 1) {
            return BigInteger.ONE;
        }
        else {
            BigInteger i = new BigInteger(input.toString());
            while(i.compareTo(BigInteger.ZERO) == 1) {
                result = result.multiply(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        System.out.println("Enter degree");
        int degree = sc.nextInt();
        for(int i = 0; i <= degree; i++) {
            BigInteger coefficient = BigInteger.ONE;
            coefficient = factorial(BigInteger.valueOf(degree));
            coefficient = coefficient.divide(factorial((BigInteger.valueOf(i)).multiply(factorial(BigInteger.valueOf(degree-i)))));
            coefficient = coefficient.multiply(BigInteger.valueOf((long)Math.pow(a,degree-i) * (long)Math.pow(b,i)));
            if(!(coefficient.equals(BigInteger.ONE))) {
                System.out.print(coefficient.toString());
            }
            if(degree-i != 0) {
                if(degree-i == 1) {
                    System.out.print("x");
                }
                else {
                    System.out.print("x^");
                    System.out.print(degree-i);
                }
            }
            if(i != 0) {
                if(i == 1) {
                    System.out.print("y");
                }
                else {
                    System.out.print("y^");
                    System.out.print(i);
                }
            }
            if(i != degree) {
                System.out.print(" + ");
            }
        }
    }

}
