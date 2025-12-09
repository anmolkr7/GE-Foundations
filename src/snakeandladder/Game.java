package snakeandladder;

public class Game {
    //Two player instance for current game
    private Player player1;
    private Player player2;

    //Dice roll
    private Dice dice;

    //Initializes the game with a default player
    public Game(){
        player1=new Player("Player 1");
        player2=new Player("Player 2");
        dice=new Dice();
    }

    //Starts the game
    public void playGame(){
        System.out.println("Welcome to Snake and Ladder Game");


        int diceCount=0;

        Player current=player1; //Player 1 starts the game

        //Loop until position=100
        while(player1.getPosition()<100 && player2.getPosition()<100){
            System.out.println("\n"+current.getName()+"'s turn:");

            //Roll the dice
            int diceValue = dice.roll();
            diceCount++;
            System.out.println("Dice Rolled:" + diceValue);

            //Generates 0,1,2 corresponding to No Play, Ladder, Snake
            int option = (int) (Math.floor(Math.random() * 10) % 3);
            int currentPosition = current.getPosition();
            boolean gotLadder=false;

            if (option == 0) {
                System.out.println("No Play"); //position remains same
            }
            else if (option == 1) {
                System.out.println("Ladder");
                currentPosition += diceValue; //move forward
                gotLadder=true;
            }
            else {
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
                currentPosition=current.getPosition(); //ignore move
            }
            //Updating player position
            current.setPosition(currentPosition);
            System.out.println(current.getName()+" Positon: " + current.getPosition());

            //win check
            if(current.getPosition()==100)
                break; //current player wins

            if(!gotLadder){
                current=(current==player1)?player2:player1;
            }
        }
        //Determining the winner
        System.out.println("GAME OVER");
        if(player1.getPosition()==100){
            System.out.println("Winner: Player 1");
        }
        else{
            System.out.println("Winner: Player 2");
        }
        System.out.println("Total Dice Rolls: "+diceCount);
    }
}
