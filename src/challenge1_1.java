public class challenge1_1 {
    static final int size = 5;
    private static void print(String input) {
        System.out.print(input);
    }
    private static void top() {
        for(int j = 0; j < size; j++) {
            for(int i = size - (j+1); i > 0; i--) {
                print("   ");
            }
            print("__/");
            for(int i = 0; i < j; i++) {
                print(":::");
            }
            print("||");
            for(int i = 0; i < j; i++) {
                print(":::");
            }
            print("\\__\n");
        }
        print("|");
        for(int i = 0; i < size; i++) {
            print("\"\"\"\"\"\"");
        }
        print("|\n");
    }
    private static void line() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                print("   ");
            }
            print("||\n");
        }
    }
    private static void bottom() {
        for(int j = size; j > 0; j--) {
            for(int i = 0; i < size - j; i++) {
                print("  ");
            }
            print("\\_");
            for(int i = 0; i < 3+j*2; i++) {
                print("/\\");
            }
            print("_/\n");
        }
    }
    private static void thick() {
        for(int i = 0; i < size*4; i++) {
            for(int j = 0; j < size*2+1; j++) {
                print(" ");
            }
            print("|%%||%%|\n");
        }
    }
    public static void main(String[] args) {
        line();
        top();
        bottom();
        line();
        thick();
        top();
    }
}
