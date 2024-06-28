package chap40.test;

import java.util.List;

public class Player {
    private String name;
    private List<Card> cardList;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void drawCard(Deck deck) {
        cardList.add(deck.drawCard());
    }

    public int rankSum() {
        int val = 0;
        for (Card card : cardList) {
            val += card.getRank();
        }

        return val;
    }

    public void showHand() {
        cardList.sort(null);
        System.out.println(name + "의 카드 " + cardList + " 합계 : " + rankSum());
    }
}
