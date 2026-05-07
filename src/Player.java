public class Player {
    public int value;
    public int numPlayer;
    public String suit;
    public boolean isFaceUp;
    public boolean hasGamlingProblem;
    public boolean isDealer = false;
    public Card[] hand;
    public int numCards;
    public static void main(String[] args) {
Player Craig = new Player(1);
    }
    public Player(int pnumPlayer){
        numPlayer = pnumPlayer;
hasGamlingProblem = true;
numCards = 0;
hand = new Card[11];
isFaceUp = true;
printPlayer();
    }
    public void printPlayer(){
        for(int i = 0; i < numCards; i ++) {
            hand[i].printInfo();
        }
    }
    public void addCard(Card newCard){
        hand[numCards] = newCard;
        numCards++;

    }

    public void sumCards(){
         int sumhand = 0;
//the combined value of every card in ur hand
        for (int i = 0; i < numCards; i ++){
           sumhand =  hand[i].value + sumhand;
        }
        System.out.println();
    }
}
