package lab6_dice_game;

/**
 * BattleDieGalactica.java
 * @author Ethan Ly
 * @author Chandan Reddy
 * CIS 36B Lab 5, Part 2
 */
import java.util.Scanner;

public class BattleDieGalactica {
    private Player player;
    private Player ai;
    
    /**
     * Prompts the user to input a number of die sides
     * Prints out the user choice and
     * Constructs a new player and ai based on the number
     * of sides of the dice
     * Note that the user input will be rounded up to 6, 8, 10
     * or 12 and also rounded down to 12 if a higher number is
     * input.
     * @param input the Scanner
     */
    private void gameSetUp(Scanner input) {
        System.out.print("Enter the number of sides (6, 8, 10 or 12): ");
        int diceSides = input.nextInt();
        if(diceSides <= 6) { 
        	diceSides = 6;
        } else if(diceSides <= 8) {
        	diceSides = 8;
        } else if(diceSides <= 10) {
        	diceSides = 10;
        }else {
        	diceSides = 12;
        }
        System.out.println(diceSides + "-sided dice!");
        player = new Player(diceSides);
        ai = new Player(diceSides);
        
    }
    
    /**
     * Prints out the current score for each opponent
     * to the console in the form:
     * Player: <score>
     * Computer: <score>
     * Note: no <> should be displayed
     */
    public void printScore() {
        System.out.println("Player: " + player.getScore());
        System.out.println("Computer: " + ai.getScore());
    }
    
    /**
     * Determines whether any player has reached
     * 21 points, thus ending the game
     * @return whether the game is over
     */
    private boolean gameOver() {
        if(player.getScore() >= 21 || ai.getScore() >= 21) {
        	return true;
        }
    	return false;
    }
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("***Welcome to Battle Die Galactica!***\n");
        BattleDieGalactica game = new BattleDieGalactica();//Hint: Use this object to call your methods

        game.gameSetUp(input);

        System.out.println();
        System.out.println("Roll the dice? (y/n): ");
        boolean keepPlaying = (input.next().equals("y"));

        if( !keepPlaying ){
        System.out.println("Game aborted!");
        }
        else {

        do {
        game.player.rollDice();
        System.out.print("Your Roll: ");
        game.player.printRoll();
        game.player.updateScore();

        System.out.println();
        System.out.println("Current Scores:");
        game.printScore();
        System.out.println();

        game.ai.rollDice();
        System.out.print("Counter Roll: ");
        game.ai.printRoll();
        game.ai.updateScore();

        System.out.println();
        System.out.println("Current Scores:");
        game.printScore();
        System.out.println();

        if( game.gameOver() )
        break;

        System.out.println("Roll again? (y/n): ");
        keepPlaying = (input.next().equals("y"));

        } while( keepPlaying );

        System.out.println("Game summary;");
        game.printScore();
        System.out.println();

        if( game.player.getScore() > game.ai.getScore() )
        System.out.println("Congratulations! You win!");
        else if( game.player.getScore() < game.ai.getScore() )
        System.out.println("You lose!");
        else
        System.out.println("Its a tie!");
        input.close();
        
        }
    }
}    