package Misc;

public class Lanterns {
    public static void print(String input) { System.out.print(input); // to save time
    }
    public static void printLantern(int size) {
        if(size <= 1) {
            print("ERROR: invalid size");
            System.exit(1);
        }
        top(size);
        print("\n");
        top(size);
        middle(size);
        top(size);
    }
    private static void top(int size) {
        for(int i = 0; i <= size; i++) {
            for(int j = 0; j < size - i; j++) {
                print("  ");
            }
            for(int j = 0; j <= i; j++) {
                print("****");
            }
            print("*\n");
        }
    }
    private static void middle(int size) {
        print("*");
        for(int i = 0; i < 2*size+1; i++) {
            print(" |");
        }
        print(" *\n");
        for(int i = 0; i <= size; i++) {
            print("****");
        }
        print("*\n");
    }
    public static void main( String[] args) {
        printLantern(2);
        System.exit(0);
    }

}
