public class printingThings {
    static void print(String input) {
        System.out.print(input);
    }
    static void bottom(int size) {
        for(int i = (size/2)-1; i >= 0; i--) {
            print("|");
            for(int j = 0; j < size/2 - i; j++) {
                print(" ");
            }
            for(int j = i; j > 0; j--) {
                print("\\");
            }
            print("*");
            for(int j = i; j > 0; j--) {
                print("/");
            }
            for(int j = 0; j < size/2 - i; j++) {
                print(" ");
            }
            print("|\n");
        }
    }
    static void top(int size) {
        for(int i = 0; i < size/2; i++) {
            print("|");
            for(int j = 0; j < size/2 - i; j++) {
                print(" ");
            }
            for(int j = i; j > 0; j--) {
                print("/");
            }
            print("*");
            for(int j = i; j > 0; j--) {
                print("\\");
            }
            for(int j = 0; j < size/2 - i; j++) {
                print(" ");
            }
            print("|\n");
        }
    }
    static void line(int size) {
        print("+");
        for(int i = 0; i <= size; i++) {
            print("-");
        }
        print("+\n");
    }
    public static void printChallenge(int size) {
        size *= 2;
        line(size);
        top(size);
        bottom(size);
        line(size);
        bottom(size);
        top(size);
        line(size);
    }
    public static void main(String[] args) {
        printChallenge(4);
    }
}
