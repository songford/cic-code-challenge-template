package com.sap.cic.code.challenge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    void test1() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.TEN, Card.Suit.CLUBS),
                new Card(Card.Kind.FOUR, Card.Suit.HEARTS),
                new Card(Card.Kind.SEVEN, Card.Suit.DIAMONDS),
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.TWO, Card.Suit.SPADES)
        );
        game.add(cards);
        assertEquals(Hand.HIGHCARD, game.showHand());
    }

    @Test
    void test2() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.KING, Card.Suit.HEARTS),
                new Card(Card.Kind.SEVEN, Card.Suit.DIAMONDS),
                new Card(Card.Kind.TWO, Card.Suit.CLUBS),
                new Card(Card.Kind.FIVE, Card.Suit.SPADES)
        );
        game.add(cards);
        assertEquals(Hand.PAIR, game.showHand());
    }

    @Test
    void test3() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.KING, Card.Suit.HEARTS),
                new Card(Card.Kind.SEVEN, Card.Suit.DIAMONDS),
                new Card(Card.Kind.SEVEN, Card.Suit.CLUBS),
                new Card(Card.Kind.FIVE, Card.Suit.SPADES)
        );
        game.add(cards);
        assertEquals(Hand.TWO_PAIRS, game.showHand());
    }

    @Test
    void test4() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.KING, Card.Suit.HEARTS),
                new Card(Card.Kind.KING, Card.Suit.DIAMONDS),
                new Card(Card.Kind.SEVEN, Card.Suit.CLUBS),
                new Card(Card.Kind.FIVE, Card.Suit.SPADES)
        );
        game.add(cards);
        assertEquals(Hand.THREE_OF_A_KIND, game.showHand());
    }

    @Test
    void test5() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.THREE, Card.Suit.CLUBS),
                new Card(Card.Kind.FOUR, Card.Suit.HEARTS),
                new Card(Card.Kind.FIVE, Card.Suit.DIAMONDS),
                new Card(Card.Kind.SIX, Card.Suit.CLUBS),
                new Card(Card.Kind.SEVEN, Card.Suit.SPADES)
        );
        game.add(cards);
        assertEquals(Hand.STRAIGHT, game.showHand());
    }

    @Test
    void test6() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.TEN, Card.Suit.CLUBS),
                new Card(Card.Kind.JACK, Card.Suit.HEARTS),
                new Card(Card.Kind.QUEEN, Card.Suit.DIAMONDS),
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.ACE, Card.Suit.SPADES)
        );
        game.add(cards);
        assertEquals(Hand.STRAIGHT, game.showHand());
    }

    @Test
    void test7() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.ACE, Card.Suit.CLUBS),
                new Card(Card.Kind.KING, Card.Suit.HEARTS),
                new Card(Card.Kind.QUEEN, Card.Suit.DIAMONDS),
                new Card(Card.Kind.JACK, Card.Suit.CLUBS),
                new Card(Card.Kind.TEN, Card.Suit.SPADES)
        );
        game.add(cards);
        assertEquals(Hand.STRAIGHT, game.showHand());
    }

    @Test
    void test8() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.ACE, Card.Suit.CLUBS),
                new Card(Card.Kind.SIX, Card.Suit.CLUBS),
                new Card(Card.Kind.EIGHT, Card.Suit.CLUBS),
                new Card(Card.Kind.JACK, Card.Suit.CLUBS),
                new Card(Card.Kind.FIVE, Card.Suit.CLUBS)
        );
        game.add(cards);
        assertEquals(Hand.FLUSH, game.showHand());
    }

    @Test
    void test9() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.KING, Card.Suit.HEARTS),
                new Card(Card.Kind.KING, Card.Suit.DIAMONDS),
                new Card(Card.Kind.SEVEN, Card.Suit.CLUBS),
                new Card(Card.Kind.SEVEN, Card.Suit.SPADES)
        );
        game.add(cards);
        assertEquals(Hand.FULL_HOUSE, game.showHand());
    }

    @Test
    void test10() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.KING, Card.Suit.HEARTS),
                new Card(Card.Kind.SEVEN, Card.Suit.DIAMONDS),
                new Card(Card.Kind.KING, Card.Suit.SPADES),
                new Card(Card.Kind.KING, Card.Suit.SPADES)
        );
        game.add(cards);
        assertEquals(Hand.FOUR_OF_A_KIND, game.showHand());
    }

    @Test
    void test11() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.TWO, Card.Suit.CLUBS),
                new Card(Card.Kind.FOUR, Card.Suit.CLUBS),
                new Card(Card.Kind.THREE, Card.Suit.CLUBS),
                new Card(Card.Kind.SIX, Card.Suit.CLUBS),
                new Card(Card.Kind.FIVE, Card.Suit.CLUBS)
        );
        game.add(cards);
        assertEquals(Hand.STRAIGHT_FLUSH, game.showHand());
    }

    @Test
    void test12() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.TEN, Card.Suit.CLUBS),
                new Card(Card.Kind.JACK, Card.Suit.CLUBS),
                new Card(Card.Kind.ACE, Card.Suit.CLUBS),
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.QUEEN, Card.Suit.CLUBS)
        );
        game.add(cards);
        assertEquals(Hand.ROYAL_FLUSH, game.showHand());
    }

    @Test
    void test13() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.TEN, Card.Suit.CLUBS),
                new Card(Card.Kind.JACK, Card.Suit.CLUBS),
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.QUEEN, Card.Suit.CLUBS)
        );
        game.add(cards);
        assertThrows(GameException.class, game::showHand);
    }

    @Test
    void test14() {
        Game game = Game.create();
        List<Card> cards = Arrays.asList(
                new Card(Card.Kind.JACK, Card.Suit.CLUBS),
                new Card(Card.Kind.JACK, Card.Suit.CLUBS),
                new Card(Card.Kind.KING, Card.Suit.CLUBS),
                new Card(Card.Kind.QUEEN, Card.Suit.CLUBS),
                new Card(Card.Kind.ACE, Card.Suit.CLUBS)
        );
        game.add(cards);
        assertThrows(GameException.class, game::showHand);
    }
}