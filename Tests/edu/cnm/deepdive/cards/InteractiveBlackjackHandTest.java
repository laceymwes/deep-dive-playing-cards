package edu.cnm.deepdive.cards;

import static org.junit.jupiter.api.Assertions.*;

import edu.cnm.deepdive.cards.Deck.InsufficientCardsException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class InteractiveBlackjackHandTest {

  private List<Card> hand1 = new ArrayList<>();
  private List<Card> hand2 = new ArrayList<>();
  private Card cardOne = new Card(Rank.ACE, Suit.SPADES);
  private Card cardTwo = new Card(Rank.TEN, Suit.DIAMONDS);
  private Card cardThree = new Card(Rank.SEVEN, Suit.DIAMONDS);
  private Card cardFour = new Card(Rank.SEVEN, Suit.DIAMONDS);
  private Card cardFive = new Card(Rank.SEVEN, Suit.DIAMONDS);

  @Test
  void testCompareTo() throws InsufficientCardsException {
    hand1.add(cardOne);
    hand1.add(cardTwo);
    hand2.add(cardThree);
    hand2.add(cardFour);
    hand2.add(cardFive);
    BlackjackDealerHand bdhOne = new BlackjackDealerHand(hand1);
    BlackjackDealerHand bdhTwo = new BlackjackDealerHand(hand2);
    System.out.println(bdhOne.compareTo(bdhTwo));
    // blackjack && !blackjack = 1
    assertEquals(1, bdhOne.compareTo(bdhTwo));
    // !blackjack && blackjack  = -1
    assertEquals(-1, bdhTwo.compareTo(bdhOne));
  }
}