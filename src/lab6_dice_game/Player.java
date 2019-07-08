package lab6_dice_game;

/**
 * Player.java
 * @author Ethan Ly
 * @author Chandan Reddy
 * CIS 36B Lab 5, Part 2
 */

public class Player {
    private Dice dice;
    private int score;
    
    /**
     * Player constructor that
     * sets the number of sides
     * of the dice the player will
     * roll and gives the player
     * a default score of 0
     * @param sides
     */
    public Player(int diceSides) {
        dice = new Dice(diceSides);
        score = 0;
    }
    
    /**
     * Rolls the two player dice
     */
    public void rollDice() {
        dice.roll();
    }
    
    /**
     * Prints the value of the the rolls
     * of the two dice to the console, with
     * each roll separated by a blank space
     */
    public void printRoll() {
        System.out.println(dice.getDie1Roll() + " " + dice.getDie2Roll());
    }
    
    /**
     * Prints out whether a special roll was made
     * and updates the score accordingly
     * For snake eyes (two 1s) prints Snake Eyes!
     * and updates the score by 5
     * When the two die rolls match otherwise,
     * prints out Matching! and updates the 
     * score by 3
     * For total of 3, prints out Total of 3!
     * and updates the score by 1
     * For total of 5, prints out Total of 5!
     * and updates the score by 2
     * For total of 7, prints out Oh no! Total of 7!
     * and resets the score back to 0
     * For total of 9, prints out Total of 9!
     * and updates the score by 3
     * For total of 11, prints out Total of 11!
     * and updates the score by 4
     * For any other odd number, prints out Odd Roll!
     * and updates the score by 2
     */
    public void updateScore() {
        int roll1 = dice.getDie1Roll();
        int roll2 = dice.getDie2Roll();
    	if(roll1 == 1 && roll2 == 1) {
        	System.out.println("Snake Eyes!");
        	score += 5;
        } else if(roll1 == roll2) {
        	System.out.println("Matching!");
        	score += 3;
        } else if(roll1 + roll2 == 3) {
        	System.out.println("Total of 3!");
        	score += 1;
        } else if(roll1 + roll2 == 5) {
        	System.out.println("Total of 5!");
        	score += 2;
        } else if(roll1 + roll2 == 7) {
        	System.out.println("Oh no! Total of 7!");
            score = 0;
        } else if(roll1 + roll2 == 9) {
        	System.out.println("Total of 9!");
        	score += 3;
        } else if(roll1 + roll2 == 11) {
        	System.out.println("Total of 11!");
        	score += 4;
        } else if(roll1 + roll2 == 13 || roll1 + roll2 == 15 || roll1 + roll2 == 17 || roll1 + roll2 == 19 || roll1 + roll2 == 21 || roll1 + roll2 == 23) {
        	System.out.println("Odd Roll!");
        	score += 2;
        } 
    }
    
    /**
     * Returns the player's current score
     * @return the current score
     */
    public int getScore() {
        return score;
    }
}