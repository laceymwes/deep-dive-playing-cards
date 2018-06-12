import static org.junit.jupiter.api.Assertions.*;

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
      assertEquals(rank.toString(), ranks[rank.ordinal()] );
      System.out.println(rank.toString());
    }
  }
}