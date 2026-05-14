import java.util.Scanner;

public class Main {
    int numCards;
    public Card[] deck;
    public Player craig;
    public Player grant;
    public Player dealer;

    public static void main(String[] args) {
        Main blackjack = new Main();
        System.out.println("Hello, World!");

        //
    }
    public Main(){
        deck  = new Card[52];
        numCards = 0;
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
        craig = new Player(1);
        grant = new Player(2);
        dealer = new Player(0);
        dealer.isDealer = true;
//        Player play;
        startGame();
    }

    public void printDeck(){
        System.out.println("This deck:");
        for(int i = 0; i < deck.length; i ++){
            deck[i].printInfo();
        }
    }
    public void startGame(){

        Scanner sc = new Scanner(System.in);

        craig.addCard(drawCard()); // this just gives everyone their cards
        craig.addCard(drawCard());

        dealer.addCard(drawCard());
        dealer.addCard(drawCard());

        while(true){

            if(craig.isBusted()){
                System.out.println("You busted!"); // says if u busted or not
                return;
            }
            System.out.println("Player 1 has: " + craig.sumCards());
            System.out.println("Player 1: (h)it or (s)tand?"); // gives player 1 the option
            String input = sc.nextLine();
            System.out.println("Player 1 has: " + craig.sumCards());


            if(input.equals("h")){
                craig.addCard(drawCard());
                craig.printPlayer();

            }
            else{
                break;
            }
        }

        while(dealer.sumCards() < 17){ // makes it so dealer always has to hit below 17
            dealer.addCard(drawCard());
        }

        System.out.println("Dealer has: " + dealer.sumCards());
        dealer.printPlayer();

        if(dealer.isBusted()){ // this is a conditional that decides who wins
            System.out.println("Dealer busted! You win!");
        }
        else if(craig.sumCards() > dealer.sumCards()){
            System.out.println("Player 1 wins!");
        }
        else if(dealer.sumCards() > craig.sumCards()){
            System.out.println("Dealer wins!");
        }
        else{
            System.out.println("Tie game.");
        }
    }
    public Card drawCard(){
        Card temp = deck[numCards];
        numCards++;
        return temp;
    }
    public void shuffle(){

        for(int i = 0; i < deck.length; i ++){

            int randnum = (int)(Math.random()* 52 );
            Card cardholder = deck[randnum];
            deck[randnum] = deck[i];
            deck[i] = cardholder;

        }
    }
}
