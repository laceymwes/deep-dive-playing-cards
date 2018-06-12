import static org.junit.jupiter.api.Assertions.assertEquals;

import edu.cnm.deepdive.cards.Suit;
import org.junit.jupiter.api.Test;

public class SuitTest {

  private static final String[] suitSymbols = {"\u2663",
                                              "\u2666",
                                              "\u2665",
                                              "\u2660"};

  @Test
  void toStringTest() {
    for (Suit suit : Suit.values()) {
        assertEquals(suitSymbols[suit.ordinal()], (suit.toString()));
        System.out.println(suit.toString());
    }
  }
}
