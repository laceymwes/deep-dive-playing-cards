import edu.cnm.deepdive.cards.Suit;
import org.junit.jupiter.api.Test;

import static edu.cnm.deepdive.cards.Suit.CLUBS;

import edu.cnm.deepdive.cards.Suit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SuitTest {

  String[] suits = {"\u2663",
      "\u2666",
      "\u2665",
      "\u2660"};

  @Test
  void toStringTest() {
    for (Suit suit : Suit.values()) {
      if (suit == Suit.CLUBS) {
        assertTrue(suits[0].equals(suit.toString()));
      }
      if (suit == Suit.DIAMONDS) {
        assertTrue(suits[1].equals(suit.toString()));
      }
      if (suit == Suit.HEARTS) {
        assertTrue(suits[2].equals(suit.toString()));
      }
      if (suit == Suit.SPADES) {
        assertTrue(suits[3].equals(suit.toString()));
      }
    }
  }
}
