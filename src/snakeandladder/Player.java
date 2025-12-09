package snakeandladder;

public class Player {
    //position- to store player's current location on board
    private int position;

    //Default constructor to initialize the position to 0
    public Player(){
        this.position=0;
    }

    //getter function to retrieve the private position variable
    public int getPosition(){
        return position;
    }

    //setter function to update the player's position as game advances
    public void setPosition(int position)
    {
        this.position=position;
    }
}
