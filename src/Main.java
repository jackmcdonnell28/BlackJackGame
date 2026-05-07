public class Main {

    public Card[] deck;
    public Player craig;

    public static void main(String[] args) {
        Main blackjack = new Main();
        System.out.println("Hello, World!");
        //
    }
    public Main(){
        deck  = new Card[52];
        for (int i = 0; i < deck.length;  i ++){
            if (i <13) {
                deck[i] = new Card(i, "Spades", true);
            }
           else if (i <26){
                deck[i] = new Card(i % 13, "Diamonds", true);
            }
           else if (i <39) {
                deck[i] = new Card(i % 13, "Hearts", true);
            }
            else if (i <52){
                deck[i] = new Card(i %13, "Clubs", true);
            }
            }
        shuffle();
        printDeck();
        startGame();
        Player play;
    }
public void printDeck(){
    System.out.println("This deck:");
    for(int i = 0; i < deck.length; i ++){
        deck[i].printInfo();
    }
}
public void startGame(){
      craig.printPlayer();
    System.out.println("The dealer has been dealt the" +deck);
}
    public void shuffle(){

        for(int i = 0; i < deck.length; i ++){

            int randnum = (int)(Math.random()*52 );
            Card cardholder = deck[randnum];
            deck[randnum] = deck[i];
            deck[i] = cardholder;

        }
    }
}
