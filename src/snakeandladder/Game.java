package snakeandladder;

public class Game {
    //single player instance for current game
    private Player player;
    //Dice roll
    private Dice dice;

    //Initializes the game with a default player
    public Game(){
        player=new Player();
        dice=new Dice();
    }

    //Starts the game
    public void playGame(){
        System.out.println("Welcome to Snake and Ladder Game");
        System.out.println("Player starting position:"+player.getPosition());

        int diceValue=dice.roll();
        System.out.println("Dice Rolled:"+diceValue);
    }
}
