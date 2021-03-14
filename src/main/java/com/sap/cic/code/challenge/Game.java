package com.sap.cic.code.challenge;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Card> cardList;

    public static Game create() {
        return new Game();
    }

    private Game() {
        this.cardList = new ArrayList<>();
    }

    public void add(List<Card> cards) {
        cardList.addAll(cards);
    }

    public void add(Card card) {
        cardList.add(card);
    }

    //EDIT ME PLEASE!
    public Hand showHand() {
        return Hand.UNKNOWN;
    }
}