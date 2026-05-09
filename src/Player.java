public class Player {

    public int numPlayer;
    public boolean isFaceUp;
    public boolean hasGamblingProblem;
    public boolean isDealer = false;

    public Card[] hand;
    public int numCards;


    public static void main(String[] args) {
        Player Craig = new Player(1);
    }

    public Player(int pnumPlayer) {
        numPlayer = pnumPlayer;

        hasGamblingProblem = true; //this boolean doesnt do anything I just thought it was funny
        numCards = 0;

        hand = new Card[11]; // this is the max amount of cards in blackjack
        isFaceUp = true;


    }

    // this one prints all the cards in hand
    public void printPlayer() {

        System.out.println("Player " + numPlayer + "'s Hand:");

        for (int i = 0; i < numCards; i++) {
            hand[i].printInfo();
        }

        System.out.println("Hand Value: " + sumCards());
        System.out.println();
    }

    // this adds a card to the player's hand
    public void addCard(Card newCard) {

        if (numCards < hand.length) {
            hand[numCards] = newCard;
            numCards++;
        }
    }

    // this calculates the value of the hand
    public int sumCards() {

        int sumHand = 0;
        int numAces = 0;

        for (int i = 0; i < numCards; i++) {

            int value = hand[i].value;

            // this helps with managing aces and their values

        }

        //  over 21, turn aces into 1 instead of 11

        return sumHand;
    }

    // Checks if player busted
    public boolean isBusted() {
        return sumCards() > 21;
    }

    // Checks for blackjack
    public boolean hasBlackjack() {
        return sumCards() == 21 && numCards == 2;
    }

    // Clears hand for next round
    public void resetHand() {

        hand = new Card[11];
        numCards = 0;
    }
}