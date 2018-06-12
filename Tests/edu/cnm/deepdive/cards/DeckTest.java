package edu.cnm.deepdive.cards;

import static org.junit.jupiter.api.Assertions.*;


import java.security.SecureRandom;
import java.util.Random;
import java.util.Set;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class DeckTest {

  private Card[] shuffledCards;
  private Card[] unshuffledCards;

  @Test
  void testDeal() {
    Deck deck = new Deck();
    Card[] cards;
    Random rng = new SecureRandom();
    assertDoesNotThrow(new Executable() {
      @Override
      public void execute() throws Throwable {
        cards = deck.deal(Suit.values().length * Rank.values().length);
      }
    });
    assertThrows(Deck.InsufficientCardsException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        deck.deal();
      }
    });
    deck.shuffle(rng);
    assertDoesNotThrow(new Executable() {
      @Override
      public void execute() throws Throwable {
        shuffledCards = deck.deal(Suit.values().length * Rank.values().length);
      }
    });
    assertThrows(Deck.InsufficientCardsException.class, new Executable() {
      @Override
      public void execute() throws Throwable {
        deck.deal();
      }
    });
    Set<Card> unshuffledSet = Set.of(unshuffledCards);
    Set<Card> shuffledset = Set.of(shuffledCards);
    asserEquals(unshuffledSet, shuffledset);

  }
}