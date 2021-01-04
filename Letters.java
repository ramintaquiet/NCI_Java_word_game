
// Java Library API: accessing Random class and its methods. 
import java.util.Random;

/**
 * ------- Find Computer Words Game ------------ by Raminta Kairyte x01416242
 * 
 * 
 * 
 * The name of the class. It is called Letters as this class provides Alphabeth
 * letters and has a method that generates random 12 letters for the player to
 * be used in the game. For the method to be used, the instance of the class
 * needs to be created and in this way the method will be accessible to be used.
 * 
 * 
 */

// the name of the class
public class Letters {

    /**
     * This is the String valiable called alphabetLetters. It contains 26 English
     * language alphabeth letters. The variable is marked as private access modifer.
     * The values can be accessed using the public geerateLetters() method. The
     * String is in Upper Case letters (for a better visual representation) but in
     * the method it gets tuned into the lower case.
     */
    private String alphabetLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * This is the CONSTANT int variable. The number of letters needed to be
     * generated is 12 This number is a requirement and cannot by changes, that is
     * why it is marked as CONSTANT The constant variable access modifier is marked
     * is final.
     */
    final int NUMBER_OF_LETTERS = 12;

    // default constructor. It doesnt take any parameters.
    Letters() {
    }

    // the name of the method. This method generates 12 random letters for the user.
    // It is a public method (public aceees modifier) that returns type of String
    // result.
    public String generateLetters() {

        /**
         * local variable of the type int. This variable gets the lenght of the String
         * aphabetLetters. It uses JAVA Liberary length() method to get the length. We
         * know that the lenght of the Sring is 26 (as there are 26 letters in the
         * English alphabet), but in case if in the future some other language alphabet
         * needs to be used, there lenght of it will be accessed via method lenghts()
         * and stored in the variable numberOfLetters.
         */

        int numberOfLetters = alphabetLetters.length();

        /**
         * this is the new local variable that the value will be stored into. The String
         * value will contain 12 random letters. This is the return value of the method.
         */
        String result12Letters = new String();

        /**
         * This the Random class from the Java library. The new instance called random
         * of the class Random Is created. It will helps to generate 12 random letters
         * (characters) from the String alphabetLeters.
         */
        Random random = new Random();

        /**
         * This "for" loop is used to put out 12 random letters. This is how it works:
         * local variable 1 is set to start the loop from index 0. It has to loop via
         * the values incrementing by one each time with the loop (i++ means when the
         * loop if finished, increment the loop by one). The loop will be stopped once
         * it matches the set contidion. In this case the condition is the CONSTANT
         * NUMBER_OF_LETTERS that has the value of 12. That means once the loop reaches
         * 12, it will stop. It will loop 12 times - from 0 to 11.
         */

        for (int i = 0; i < NUMBER_OF_LETTERS; i++)

            /**
             * This is the local variable the the values will be given to. How it works:
             * When the loop if going each circle, the random selects a random index and
             * taked the letter (acharacter) from the index of the alphabeth string and
             * stores it into the new variable character of the loop circle. For example:
             * The generated number is 5. The character (charAt) in the String
             * alphabetLetters is F (as it starts from 0). The loop is in its first circle,
             * so the first value of the 12 String result12Letters is F. The loop is going
             * its second circle (loop). It is incremented by 1. This time the random number
             * is 3. The index of 3 in the alphabeth is D. The second value is D Now it has
             * two characters out of 12 and they are "FD" It increments again and loops
             * while it reached 12 and it stops.
             * 
             */
            result12Letters = result12Letters + alphabetLetters.charAt(random.nextInt(numberOfLetters));

        /**
         * Once the loop stoped, the value is fully stored in the result12Letters
         * variable. me method toLoweCase() sets the String to be lower case.
         */

        return result12Letters.toLowerCase();

    }

    // the end of the class

}