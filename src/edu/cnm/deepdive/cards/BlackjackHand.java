package edu.cnm.deepdive.cards;

import edu.cnm.deepdive.cards.Deck.InsufficientCardsException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class BlackjackHand {

  private List<Card> hand;
  private Deck deck;
  private static final int[] values = {
      1,
      2,
      3,
      4,
      5,
      6,
      7,
      8,
      9,
      10,
      10,
      10,
      10
  };

  public BlackjackHand(Deck deck) throws InsufficientCardsException {
    hand = new LinkedList<>();
    hand.addAll(Arrays.asList(deck.deal(2)));
    this.deck = deck;
  }

  private int value() {
    boolean aceInHand = false;
    int value = 0;
    for (Card card : hand) {
      if (card.getRank() == Rank.ACE) {
        aceInHand = true;
      }
      value += values[card.getRank().ordinal()];
    }
    if (value > 21) {
      value = 0;
    }
    else if(value <= 11 && aceInHand) {
      value += 10;
    }
    return value;
  }
}
