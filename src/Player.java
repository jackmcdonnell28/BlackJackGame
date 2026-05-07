public class Player {
    public int value;
    public String suit;
    public boolean isFaceUp;
    public boolean hasGamlingProblem;
    public static void main(String[] args) {
Player Craig = new Player();
    }
    public Player(){
hasGamlingProblem = true;
printPlayer();
    }
    public void printPlayer(){
        System.out.println("This player has been dealt the" +value+ " of " + suit);
        System.out.println("This player has also been dealt the" +value+ " of " + suit);

    }
}
