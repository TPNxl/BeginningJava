import java.util.Scanner;

public class p6_14_9 {
    public static void print(String input) { System.out.print(input);}
    public static void println(String input) { System.out.println(input);}
    public static int[] numShift(int[] array, int shift) {
        int[] output = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            output[i] = array[i] + shift;
        }
        for(int i = 0; i < array.length; i++) {
            output[i] = output[i] % 10;
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pn, noSpace;
        while(true) {
            println("Enter a phone number.");
            pn = sc.next();
            noSpace = pn.replace("-","").replace(" ","");
            Boolean allDigs = true;
            for(int i = 0; i < noSpace.length(); i++) {
                if(!(Character.isDigit(noSpace.charAt(i)))) {
                    allDigs = false;
                    break;
                }
            }
            if(noSpace.length() == 10 && allDigs) {
                break;
            }
        }
        int[] pd = new int[10];
        for(int i = 0; i < 10; i++) {
            pd[i] = Integer.parseInt(String.valueOf(noSpace.charAt(i)));
        }
        int shift;
        int[] shifted = new int[10];
        for(shift = 0; shift < 10; shift++) {
            shifted = numShift(pd, shift);
            if(shifted[0] == 2 && shifted[1] == 1 && shifted[2] == 2) {
                break;
            }
        }
        if(shift == 10) {
            println("ERROR: cannot decode phone number");
        } else {
            print("The phone number is ");
            for(int i = 0; i <= 2; i++) {
                System.out.print(shifted[i]);
            }
            print("-");
            for(int i = 3; i <= 5; i++) {
                System.out.print(shifted[i]);
            }
            print("-");
            for(int i = 6; i < shifted.length; i++) {
                System.out.print(shifted[i]);
            }
            print(", the shift was " + shift);
        }
    }
}
