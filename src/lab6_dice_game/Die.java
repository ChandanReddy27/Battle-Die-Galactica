package lab6_dice_game;

/**
* Die.java
* @author Ethan Ly
* @author Chandan Reddy
* CIS 36B Lab 5, Part 2
*/

import java.util.Random;

public class Die {
   private int roll;
   private int numSides;
   
   /**
    * Default constructor for a Die
    * Initializes roll to 0
    * and numSides to the standard 6
    */
   public Die() {
   	roll = 0;
   	numSides = 6;
   }
   
   /**
    * Constructor for a Die
    * Initializes roll to 0
    * and numSides to specified
    * number of sides
    * @param numSides the 
    * number of sides to the die
    */
   public Die(int numSides) {
       roll = 0;
       this.numSides = numSides;
   }
   
   /**
    * Assigns roll to a random value
    * from 1 to numSides
    */
   public void makeRoll() {
       Random random = new Random();
       roll = random.nextInt(numSides) + 1;
   }
   
   /**
    * Returns the roll number
    * @return the number generated
    * when die is rolled
    */
   public int getRoll() {
       return roll;
   }
}