package edu.cnm.deepdive.cards;

import edu.cnm.deepdive.cards.Deck.InsufficientCardsException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class BlackjackDealerHand extends BlackjackHand {

  public BlackjackDealerHand(Deck deck) throws InsufficientCardsException {
    super(deck);
  }

  public BlackjackDealerHand(List<Card> hand) throws InsufficientCardsException {
    super(hand);
  }

  @Override
  public void play() throws InsufficientCardsException, IOException {
    while (getValue() < 17 && !isBusted()) {
      hit();
    }
  }
}
