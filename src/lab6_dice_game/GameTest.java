package lab6_dice_game;

/**
 * GameTest.java
 * @author Ethan Ly
 * @author Chandan Reddy
 * CIS 36B Lab 5, Part 2
 */
public class GameTest {
    public static void main(String[] args) {
        
        System.out.println("***Testing Die Class***");
        Die d = new Die(6);
        d.makeRoll();
        System.out.println("Die roll: " + d.getRoll());
        
        System.out.println("\n***Testing Dice Class***");
        Dice dice = new Dice(8);
        dice.roll();
        System.out.println("Die 1 roll: " + dice.getDie1Roll());
        System.out.println("Die 2 roll: " + dice.getDie2Roll());
        
        System.out.println("\n***Testing Player Class***");
        Player player = new Player(6);
        player.rollDice();
        player.printRoll();
        player.updateScore();
        System.out.println("Score: " + player.getScore());
        
        //add more method calls where needed
    }
}
