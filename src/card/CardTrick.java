package card;

import java.util.Random;

/**
 * Modifier: Dev Patel
 * Student #: 991783501
 * Date: May 21, 2025
 */

public class CardTrick {

    public static void main(String[] args) {
        // Create a magic hand of 7 cards
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1);
            c.setSuit(suits[rand.nextInt(4)]);
            magicHand[i] = c;
        }

        // Hard-coded lucky card
        Card luckyCard = new Card();
        luckyCard.setValue(5);
        luckyCard.setSuit("Diamonds");

        boolean found = false;

        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() &&
                c.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("🎉 Your lucky card was found! You win!");
        } else {
            System.out.println("❌ Your lucky card was NOT found. Better luck next time.");
        }

        System.out.println("\nMagic Hand:");
        for (Card c : magicHand) {
            System.out.println(c.getSuit() + " " + c.getValue());
        }

        System.out.println("\nLucky Card: " + luckyCard.getSuit() + " " + luckyCard.getValue());
    }
}


