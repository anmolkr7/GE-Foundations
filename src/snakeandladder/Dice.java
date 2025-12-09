package snakeandladder;

public class Dice {
    public int roll(){
        return (int)(Math.floor(Math.random()*10)%6)+1;
    }
}
