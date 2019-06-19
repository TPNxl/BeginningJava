import java.util.ArrayList;
import java.util.Scanner;

public class hangman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = "hii";
        ArrayList<String> chars = new ArrayList<>();
        int j = 0;
        for(int i = 0; i < word.length(); i++) {
            chars.add(Character.toString(word.charAt(i)));
        }
        while(j < 7) {
            System.out.println("Enter a letter");
            String input = sc.next();
            if(input.length() == 1) {
                boolean found = false;
                for(String character : chars) {
                    if(character.equals(input)) {
                        found = true;
                        chars.remove(character);
                    }
                }
                if(!found) {
                    System.out.println("Not in word");
                }
            }
            if(chars.size() == 0) {
                break;
            }
            else {
                j++;
            }
        }
        if(j < 7) {
            System.out.println("Guessed");
        }
        else {
            System.out.println("Not guessed");
        }
    }
}
