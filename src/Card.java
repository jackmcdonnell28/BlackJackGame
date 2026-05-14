public class Card {
    public int value;
    public String suit;
    public boolean isFaceUp;

    // public static void main(String[] args) {
    // Card card = new Card();
//
    public Card(int pvalue, String psuit, boolean pisFaceUp) {
        if(pvalue == 0){ // i made the value into a conditional, this makes the numbers normal and causes all face cards to have a value of 10
            value = 1;
        }
        else if(pvalue >= 10){
            value = 10;
        }
        else{
            value = pvalue + 1;
        }
        suit = psuit;
        isFaceUp = pisFaceUp;
    }

    public void printInfo() {
        if (value == 0) {
            System.out.println("Ace of " + suit);
        } else if (value == 10) {
            System.out.println("Jack of " + suit);
        } else if (value == 11) {
            System.out.println("Queen of " + suit);
        } else if (value == 12) {
            System.out.println("King of " + suit);
        } else {
            System.out.println((value + 1) + " of " + suit);
        }
    }
}



//to shuffle something you always need 3 places to input them into

// Player 1 has: 15
//5 of Diamonds
//King of Diamonds
//Player 1: (h)it or (s)tand?