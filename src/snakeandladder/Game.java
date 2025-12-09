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

        //Loop until position=100
        while(player.getPosition()<100) {
            //Roll the dice
            int diceValue = dice.roll();
            System.out.println("Dice Rolled:" + diceValue);

            //Generates 0,1,2 corresponding to No Play, Ladder, Snake
            int option = (int) (Math.floor(Math.random() * 10) % 3);
            int currentPosition = player.getPosition();

            if (option == 0) {
                System.out.println("No Play"); //position remains same
            } else if (option == 1) {
                System.out.println("Ladder");
                currentPosition += diceValue; //move forward
            } else {
                System.out.println("Snake");
                currentPosition -= diceValue; //move backwards
            }
            //Reset to 0 if negative
            if(currentPosition<0){
                System.out.println("Position < 0, so reset to 0");
                currentPosition=0;
            }

            //Exact 100 winning rule
            if(currentPosition>100){
                System.out.println("Move exceeds 100, stay at same position");
                currentPosition=player.getPosition(); //ignore move
            }
            //Updating player position
            player.setPosition(currentPosition);
            System.out.println("Player Positon after dice roll:" + player.getPosition());
        }
        System.out.println("Congratulations! Player reached Exact Winning 100");
    }
}
