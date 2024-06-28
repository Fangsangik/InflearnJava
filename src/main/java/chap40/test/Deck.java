package chap40.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cardList = new ArrayList<>();

    private void initCard(){
        for (int i = 0; i <= 13; i++) {
            for (Icon icon : Icon.values()) {
                cardList.add(new Card(i, icon));
            }
        }
    }

    private void shuffle(){
        Collections.shuffle(cardList);
    }

    public Card drawCard(){
        return cardList.remove(0);
    }
}
