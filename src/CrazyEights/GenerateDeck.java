package CrazyEights;

import java.io.FileWriter;
import java.io.IOException;

import static CrazyEights.MainCode.*;

public class GenerateDeck {
    public static void main(String[] args) throws IOException {
        String deckString = "";
        FileWriter fw = new FileWriter(deckFile);
        String[] colors = {"red", "blue", "green", "yellow"};
        String[] specials = {"plusTwo", "reverse"};
        for(String color : colors) {
            for(int i = 0; i < 10; i++) {
                deckString += (i+" "+color+"\n");
            }
            for(String special : specials) {
                deckString += (special+" "+color+"\n");
            }
            deckString+=("color "+color+"\n");
            for(int i = 1; i < 10; i++) {
                deckString+=(i+" "+color+"\n");
            }
            for(String special : specials) {
                deckString+=(special+" "+color+"\n");
            }
            deckString+=("plusFour "+color+"\n");
        }
        fw.write(deckString);
        fw.flush(); fw.close();
    }
}
