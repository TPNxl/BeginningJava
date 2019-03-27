public class Challenge1 {
    private static void print(String input) {
        System.out.print(input);
    }
    private static void challengeBottom(int size) {
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
    private static void challengeTop(int size) {
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
    private static void challengeLine(int size) {
        print("+");
        for(int i = 0; i <= size; i++) {
            print("-");
        }
        print("+\n");
    }
    public static void printChallenge(int size) {
        if(size < 2) {
            print("ERROR: invalid size with printChallenge method");
            System.exit(1);
        } else {
            size *= 2;
        }
        challengeLine(size);
        challengeTop(size);
        challengeBottom(size);
        challengeLine(size);
        challengeBottom(size);
        challengeTop(size);
        challengeLine(size);
        System.exit(0);
    }
    public static void main(String[] args) {
        printChallenge(4);
        System.exit(0);
    }
}
