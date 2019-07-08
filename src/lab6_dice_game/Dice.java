package lab6_dice_game;

/**
 * Dice.java
 * @author Ethan Ly
 * @author Chandan Reddy
 * CIS 36B Lab 5, Part 2
 */

public class Dice {
    private Die die1;
    private Die die2;
    
    /**
     * Default constructor
     * sets both dice to
     * be 6 sided
     */
    public Dice() {
        die1 = new Die();
        die2 = new Die();
    }
    
    /**
     * Constructor to set
     * both dice to have the 
     * same number of sides
     * @param sides the number
     * of sides of both dice
     */
    public Dice(int sides) {
        die1 = new Die(sides);
        die2 = new Die(sides);
    }
    
    
    /**
     * Rolls both dice
     */
    public void roll() {
        die1.makeRoll();
        die2.makeRoll();
    }
    
    /**
     * Returns the roll value
     * of Die1
     * @return the roll value
     * of Die1
     */
    public int getDie1Roll() {
        return die1.getRoll();
    }
    
    /**
     * Returns the roll value
     * of Die2
     * @return the roll value
     * of Die2
     */
    public int getDie2Roll() {
        return die2.getRoll();
    }
    
    /**
     * Returns the sum of the
     * roll values of Die1 
     * and Die2
     * @return the sum of the rolls
     */
    public int getSumRolls() {
        return die1.getRoll() + die2.getRoll();
    }
    
}