public class Diamond_Loop {
    static void print(String input) {
        System.out.print(input);
    }
    public static void printDiamondLoop(int size) {
        if(size <= 1) {
            System.out.println("ERROR: invalid size for printDiamondLoop");
            System.exit(1);
        }
        size = size - 1;
        for(int j = 0; j <= size; j++) {
            for(int i = 0; i < size - j; i++) {
                print(" ");
            }
            print("/");
            for(int i = 0; i < j; i++) {
                print("  ");
            }
            print("\\\n");
        }
        for(int j = size; j >= 0; j--) {
            for(int i = 0; i < size - j; i++) {
                print(" ");
            }
            print("\\");
            for(int i = 0; i < j; i++) {
                print("  ");
            }
            print("/\n");
        }
    }
    public static void main(String[] args) {
        printDiamondLoop(80);
        System.exit(0);
    }
}
