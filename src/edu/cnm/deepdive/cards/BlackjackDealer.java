package edu.cnm.deepdive.cards;

import edu.cnm.deepdive.cards.Deck.InsufficientCardsException;
import java.io.IOException;
import java.util.Scanner;

public class BlackjackDealer extends BlackjackHand {

  public BlackjackDealer(Deck deck) throws InsufficientCardsException {
    super(deck);
  }

  @Override
  public void play() throws InsufficientCardsException, IOException {
   }
}
