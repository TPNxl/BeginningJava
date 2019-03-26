// Import statements
package Convert;
import java.util.Scanner;
import java.math.*;

public class BinaryConversion {
    public static void main( String[] args ) {
        // Set up variables and arrays
        Scanner sc = new Scanner(System.in);
        int i, j;
        int oldBase = 0, newBase = 0, zeroAdd = 0;
        long value = 0;
        BigInteger value2, newBase2;
        boolean confirmGoodNumber, negative = false;
        String number, confirmation;
        char[] digitChars, answerChars;
        char[] numberA = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '/', '+'}; // All the possible characters
        int[] digits;
        long[] answerDigits;
        int[] numberB = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,
                25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45,
                46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63}; // All the possible values of integers

        while(true) {
            // Get variables
            System.out.println("Choose current base (bases supported: 2-64)");
            // Enter old base, check if valid
            do {
                if (sc.hasNextInt()) {
                    oldBase = sc.nextInt();
                }
                else {
                    sc.next();
                }
                if (oldBase < 2) {
                    System.out.println("Not a valid base; please type a valid one.");
                }
            } while(oldBase < 2);
            System.out.println("Choose base to convert to (bases supported: 2-64)");
            // Enter new base, check if valid
            do {
                if (sc.hasNextInt()) {
                    newBase = sc.nextInt();
                }
                else {
                    sc.next();
                }
                if (newBase < 2) {
                    System.out.println("Not a valid base; please type a valid one.");
                }
                else if (newBase == oldBase) {
                    System.out.println("That's the same base as the old one! Please type a different base.");
                }
            } while(newBase < 2 || newBase == oldBase);
            // Enter the number to convert, check if valid
            System.out.print("Enter the number to convert: ");
            if (oldBase > 36 && oldBase < 63) {
                System.out.println("Use uppercase letters for values of 10-35 and lowercase letters for values of" +
                        " 36-61.");
            }
            else if (oldBase > 62 && oldBase < 65) {
                System.out.println("Use uppercase letters for values of 10-35, lowercase letters for values of" +
                        " 36-61, / for 62, and + for 63.");
            }
            else if (oldBase > 10 && oldBase <= 36) {
                System.out.println("Use letters for values of 10-35.");
            }
            else if (oldBase <= 10){
                System.out.print("\n");
            }
            // Check if all digits are in the base, AND set up for the conversion
            do {
                confirmGoodNumber = true;
                number = sc.next();
                if(number.charAt(0) == '-') {
                    negative = true;
                    number = number.replace("-","");
                }
                if(oldBase <= 36) {
                    // Avoid odd bugs
                    number = number.toUpperCase();
                }
                digitChars = new char[number.length()];
                for(i = 0; i < number.length(); i++){
                    digitChars[i] = number.charAt(i);
                }

                digits = new int[digitChars.length];
                for(i = 0; i < digitChars.length; i++) {
                    for (j = 0; j < oldBase; j++) {
                        if (numberA[j] == digitChars[i]) {
                            break;
                        }
                    }
                    digits[i] = numberB[j];
                }
                for(i = 0; i < digits.length; i++) {
                    if(digits[i] > oldBase - 1) {
                        confirmGoodNumber = false;
                        break;
                    }
                }
                if(!confirmGoodNumber) {
                    System.out.println("One or more of your digits was invalid in the base you've selected. Please check" +
                            " your input.");
                }
            } while (!confirmGoodNumber);
            newBase2 = new BigInteger(Integer.toString(newBase));

            // Convert to base 10
            for(i = 0; i < digits.length; i++) {
                value += (digits[i]*(Math.pow(oldBase,(digits.length - (i+1)))));
            }

            // Set up for conversion to new base
            answerDigits = new long[9999];
            for(i = 0; i < answerDigits.length; i++) {
                answerDigits[i] = -1;
            }

            // Convert to new base
            i = 0;
            while(value > 0) {
                value2 = new BigInteger(Long.toString(value));
                answerDigits[i] = value2.mod(newBase2).longValue();
                value /= newBase;
                i++;
            }

            // Read out data backwards, due to the method used
            answerChars = new char[i];
            for(i = 0; i < answerChars.length; i++) {
                for(j = 0; j < newBase; j++) {
                    if(answerDigits[i] == numberB[j]) {
                        break;
                    }
                }
                answerChars[answerChars.length - (i+1)] = numberA[j];
            }

            // Print answers (with binary in groups of 4 digits for both input and output)
            if (negative) {
                System.out.print("-");
            }
            if(oldBase == 2) {
                i = 0;
                if(digits.length % 4 != 0) {
                    zeroAdd = (4 - (digits.length % 4));
                    i += zeroAdd;
                    for(j = 0; j < zeroAdd; j++) {
                        System.out.print("0");
                    }
                }
                while(i < digits.length + zeroAdd) {
                    System.out.print(digits[i - zeroAdd]);
                    if((i+1)%4 == 0 && i != 0 && i != digits.length + zeroAdd - 1) {
                        System.out.print(" ");
                    }
                    i++;
                }
            }
            else {
                System.out.print(number);
            }
            System.out.print(" in base " + oldBase + " is ");
            i = 0;
            zeroAdd = 0;
            if (negative) {
                System.out.print("-");
            }
            if(newBase == 2 && answerChars.length % 4 != 0) {
                zeroAdd = (4 - (answerChars.length % 4));
                i += zeroAdd;
                for(j = 0; j < zeroAdd; j++) {
                    System.out.print("0");
                }
            }
            while(i < answerChars.length + zeroAdd) {
                System.out.print(answerChars[i - zeroAdd]);
                if(newBase == 2 && (i+1)%4 == 0 && i != 0 && i != answerChars.length + zeroAdd - 1) {
                    System.out.print(" ");
                }
                i++;
            }
            System.out.print(" in base " + newBase + ".\n");
            System.out.println("Convert again?");
            confirmation = sc.next().toLowerCase();
            if(confirmation.charAt(0) == 'y') {
                oldBase = 0; newBase = 0; zeroAdd = 0; value = 0;
                negative = false;
                System.out.print("\n");
            }
            else {
                break;
            }
        }
    }
}