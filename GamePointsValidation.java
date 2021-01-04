/**
 * ------- Find Computer Words Game ------------ by Raminta Kairyte x01416242
 * 
 * */

/**
 * This is the name of the class. This class contains the code checking the
 * validation for receiving points. As per rules of the game, the player can
 * receive the points if the entered word is combined from the given letters AND
 * if the word matched one of the word from the ValidWords class String array
 * value. Only if both of the conditions are fullfiled (true), the player gets
 * the points. If none or only one condition if fulfilled, no points is given.
 */
public class GamePointsValidation {

    // default constructor. It does not take any parameters
    GamePointsValidation() {
    }

    /**
     * 
     * VALIDATION NR. 1: Does the entered word's letters match the given letters?
     */

    /**
     * This method is checks if the players word is composed of given letters. The
     * method is boolean type, that means it returns true or false. IF the word is
     * composed of the given letters, the method return TRUE and will print a
     * statement "Yes". In case if it doesnt match, the method will return FALSE and
     * print "No" statement in the output. --- The method takes two parameters:
     * 
     * -- String randomStringLetters - this parameter is a random string letters,
     * that is provided to the player to compuse the word from.
     * 
     * -- String wordToCheck - this parameter is the given word. The letters
     * (characters) of this word if compared with the values of the
     * randomStringLeters characters.
     * 
     */

    public boolean checkWordLetters(String randomStringLetters, String wordToCheck) {

        // printing the statement of the Validation rule
        System.out.println("-------------------");
        System.out.println("VALIDATION RULE NR.1"); // name of the rule
        System.out.println("Does the entered word's letters match the given letters? "); // the validarion rule

        /**
         * Nested loop to check the validation Frst we have for loop. It takes each
         * element starting from index 0 and checks it. The loop will stop when it will
         * reach the given lenght - the lenght of the wordToCheck. Lets say the entered
         * word is 5 characers lenght. The loop will go in each index from 0 to 4 and
         * checks each letter for the match.
         */
        for (int i = 0; i < wordToCheck.length(); i++) {
            /**
             * Here is the if statement defining the case of False. How it works: -->
             * randomStringLetters.indexOf - this takes one element (one letter or one
             * character) of the given String. The indexOf indicaed which one to take.
             * -->(wordToCheck.charAt(i)) - this gives the character form the given word.
             * the charAt again takes each character from the given word to compare. The int
             * i is taked from the "for" loop - it loops in a loop. It takes each index
             * characterof the give word. the whole value is equal -1. The number -1 is
             * chosen because the index starts from 0 and it goes to unknows. We do not know
             * how many character can the in the word, it could be a very long word. Instead
             * the equality if chosen to the value that the character CANNOT be. It cannot
             * be a negative index, so -1 (minus 1) is a safe choice. It could be any
             * negative number. --- Here is an example: Lets say the word is binary and
             * fiven letters are buiynganrbyt. What "for" loop does: Takes the lenght of the
             * binary word (6) and check each: index 0 -b, index 1 -i, index 2 -n, index 3
             * -a, index 4 -r, index 5 -y.
             * 
             * In the for loop, in each circle, the check performed if the letter matches:
             * 
             * index 0 -b randomStringLetters.indexOf(0) is b, b == b, index 0 == index 0.
             * The statementis true, it canot be == -1. Statement is true, it moves to next
             * loop. It loops throught each element ad if any does ot watch, it gives false.
             * 
             */
            if (randomStringLetters.indexOf(wordToCheck.charAt(i)) == -1) {
                System.out.println("No"); // prints statememt "No" meaning the letters did not match.
                System.out.println(" ");
                return false; // return outcome of the boolean

            }
        }
        /**
         * If the statements in the given loop is doesnt meet the defines condition
         * (==1), Prin the statement yes. As in given example, the word binary is
         * composed from the random given letters, so the condition is TRUE and the
         * statement "yes" will be printed
         */
        System.out.println("Yes");

        System.out.println(" ");

        return true; // return outcome of the boolean.

    }

    /**
     * 
     * VALIDATION NR. 2: Is the entered word part of the Computer Valid Words
     * Vocabulary?
     */

    /**
     * This method checks if the entered word belongs to the Approved Computer word
     * vocabulary. This method is boolean type, that means it returns either true or
     * false. It takes two String type parameters:
     * 
     * -- String checkingWord - this is the word that the palyer entered. This word
     * will be looped through the array of the Vocabulary (ValidWords class) and
     * checked if each value matched the word. If the match is part of the
     * vacabulary (the match is found), then the boolean statement is TRUE and "Yes"
     * will be printed. If the words will go thought the whole loop and will not
     * find the match, that means that the word is not part of the vocabulary and
     * the boolean confition is false. The statement "No" will be printed on the
     * screen.
     * 
     * --String validWordsArray[] - this is the array of words that the word will be
     * checked via loop. Each word (value) will be compared with the given word
     * starting from index 0 to the last element of the array.
     * 
     */

    public boolean isValidInVocabulary(String checkingWord, String validWordsArray[]) {

        System.out.println("VALIDATION RULE NR. 2"); // name of the rule
        System.out.println("Is the entered word part of the Computer Valid Words Vocabulary?"); // the rule

        /**
         * This is the loop that takes the entered word and checks with each element of
         * the array.
         * 
         * Here is how it works:
         * 
         * It takes a local variable String localWord from the array. It starts from the
         * index 0 to the end of the array. Tha means the localWord becomes first value,
         * then second value, than third, etc.
         */
        for (String localWord : validWordsArray) {

            /**
             * Here is the comparesement is done. If the localWord element value is equal
             * tothe entered word (checkingWrod), the boolean statement is true and it
             * prints "yes".
             * 
             * Here is an example: Lets say the entered word is "site". First element if the
             * array of the class ValidWord is /"algorithm". It check is the "site" element
             * is the same (euqals) to "algorithm". In this case is no, so the loop moves on
             * to the next. The next element is "application". This is not a match either,
             * so the loop moves on. If the mach is found, the loop stops and prints "yes".
             * If the match is not found, it prints "no".
             */

            if (localWord.equals(checkingWord)) {
                System.out.println("Yes"); // statement outcome to be printed
                System.out.println(" ");
                return true; // boolean statement TRUE
            }

        }
        System.out.println("No"); // statement outcome to be printed
        System.out.println(" ");
        return false; // boolean statement FALSE

    }

    // the end of the class
}