/*
Timmy Nadolsky
Diamond
Has a method to print a diamond, prints it 3 times

 */

public class Diamond {
    private static void print(String input) {
        System.out.print(input);
    }
    private static void println(String input) {
        System.out.println(input);
    }
    /*
    public static void printDiamond(String input) {
        switch (input = input.toLowerCase()) {
            case "top":
                println("   /\\   ");
                println("  /  \\  ");
                println(" /    \\ ");
            case "bottom":
                println(" \\    / ");
                println("  \\  /  ");
                println("   \\/   ");
            case "all":
                printDiamond("top");
                printDiamond("bottom");
            case "reverse":
                printDiamond("bottom");
                printDiamond("top");
            default:
                println("ERROR: INVALID INPUT");
        }
    }

    public static void printSquare() {
        println("+------+" +
                "|      |" +
                "|      |" +
                "+------+");
    }
    public static void printRocket(){
        printDiamond("all");
        printDiamond("reverse");
        printDiamond("top");
        printSquare();
        println("|Trump |");
        println("|for   |");
        println("|Prez  |");
        printSquare();
        println("#asciiForLife");
    }
    public static void printLoop(int size) {
        // Check if size is valid
        if(size <= 1) {
            // Print error and kill execution
            println("ERROR: invalid size for printDiamondLoop");
            System.exit(1);
        }
        size = size - 1;
        // Top part
        for(int j = 0; j <= size; j++) {
            // Spaces before left slash
            for(int i = 0; i < size - j; i++) {
                print(" ");
            }
            print("/"); // Left slash
            // Spaces in between slashes
            for(int i = 0; i < j; i++) {
                print("  "); // 2 spaces
            }
            // Right slash, new line
            print("\\\n");
        }
        // Bottom part
        for(int j = size; j >= 0; j--) {
            // Spaces before left slash
            for(int i = 0; i < size - j; i++) {
                print(" ");
            }
            print("\\"); // Right slash
            // Spaces in between slashes
            for(int i = 0; i < j; i++) {
                print("  "); // 2 spaces
            }
            // Left slash, new line
            print("/\n");
        }
    }
    public static void printGeneric(int size, String beg, String inside, String end) {
        // Check if size is valid
        if(size <= 1) {
            // Print error and kill execution
            System.out.println("ERROR: invalid size for printDiamondLoop");
            System.exit(1);
        }
        size = size - 1;
        // Top part
        for(int j = 0; j <= size; j++) {
            // Spaces before left slash
            for(int i = 0; i < size - j; i++) {
                print(" ");
            }
            print(beg); // Left slash
            // Spaces in between slashes
            for(int i = 0; i < j; i++) {
                print(inside); // 2 spaces
            }
            // Right slash, new line
            print(end+"\n");
        }
        // Bottom part
        for(int j = size; j >= 0; j--) {
            // Spaces before left slash
            for(int i = 0; i < size - j; i++) {
                print(" ");
            }
            print(end); // Right slash
            // Spaces in between slashes
            for(int i = 0; i < j; i++) {
                print(inside); // 2 spaces
            }
            // Left slash, new line
            print(beg+"\n");
        }
    }
    */
}
