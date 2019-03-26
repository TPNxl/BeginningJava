/*
Timmy Nadolsky
Diamond
Has a method to print a diamond, prints it 3 times

 */

public class Diamond {
    public static void printDiamond(String input) {
        input = input.toLowerCase();
        if(input == "top") {
            System.out.println("   /\\   ");
            System.out.println("  /  \\  ");
            System.out.println(" /    \\ ");
        }
        else if(input == "bottom" || input == "bot") {
            System.out.println(" \\    / ");
            System.out.println("  \\  /  ");
            System.out.println("   \\/   ");
        }
        else if(input == "all") {
            printDiamond("top");
            printDiamond("bottom");
        }
        else if(input == "reverse") {
            printDiamond("bottom");
            printDiamond("top");
        }
        else {
            System.out.println("ERROR: INVALID INPUT");
        }
    }
    public static void printSquare() {
        System.out.println("+------+");
        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("+------+");
    }
    public static void main(String[] args){
        printDiamond("all");
        printDiamond("reverse");
        printDiamond("top");
        printSquare();
        System.out.println("|United|");
        System.out.println("|States|");
        printSquare();
        System.out.println("#asciiForLife");
    }
}
