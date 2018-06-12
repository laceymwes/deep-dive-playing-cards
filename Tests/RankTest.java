import static org.junit.jupiter.api.Assertions.*;

import edu.cnm.deepdive.cards.Rank;
import org.junit.jupiter.api.Test;

class RankTest {
  String[] ranks = {
      "A",
      "2",
      "3",
      "4",
      "5",
      "6",
      "7",
      "8",
      "9",
      "10",
      "J",
      "Q",
      "K"
  };

  @Test
  void testToString() {
    for (Rank rank : Rank.values()) {
      assertEquals(ranks[rank.ordinal()], rank.toString());
      System.out.println(rank.toString());
    }
  }
}