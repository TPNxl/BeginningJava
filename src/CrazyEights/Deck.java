package CrazyEights;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Deck {
    private static Random rand = new Random();
    private static ArrayList<Card> deck = new ArrayList<>();
    Deck(File f) throws IOException {
        Scanner deckFile = new Scanner(f);
        while(deckFile.hasNext() && deckFile.hasNextLine()) {
            deck.add(new Card(deckFile.next(),deckFile.next()));
        }
    }
    int getSize() {
        return deck.size();
    }
    Card generateCard(boolean remove) {
        int i = rand.nextInt(deck.size());
        Card randomCard = deck.get(i);
        if(remove) {
            deck.remove(i);
        }
        return randomCard;
    }
    Card generateCardNumber(boolean remove) {
        Card randomCard;
        int i;
        do {
            i = rand.nextInt(deck.size());
            randomCard = deck.get(i);
        } while(!(randomCard.isNumber()));
        if(remove) {
            deck.remove(i);
        }
        return randomCard;
    }
    void regenerateDeck() {

    }
}
