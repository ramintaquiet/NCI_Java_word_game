import java.util.Scanner; //Import scanner utility to read input from user.
import java.util.Random;

public class WordScramble {
    public static void main(String[] args) { 
        int guesses = 10;
        String word = new String("geometric"); //Word to guess
        String scramble = new String(""); //Where to scrambled word is stored.
    	Scanner reader = new Scanner(System.in);
        Boolean game = true;

        System.out.println("Guess the word! (Case-sensitive)");
        scramble = scramble(word);
        System.out.println("The scrambled word is: " + scramble);

        while(game){
            if(guesses > 0){ //Let the player guess
                System.out.println("Number of guesses remaining: " + guesses);
                System.out.println("Your guess: ");
                String userGuess = reader.nextLine();

                if(userGuess.equals(word)){ //Player guessed correctly.
                    System.out.println("You win!");
                    game = false;
                }
                else{ //Player got it wrong.
                    System.out.println("Incorrect!");
                    guesses--;
                }
            }
            else{ //The player is out of guesses
                System.out.println("You lost! The word was: " + word);
                game = false;
            }
        }
    }

    public static String scramble(String str){ //Take a string and scramble it.
        Random r = new Random();
        char newStr[] = str.toCharArray();

        for(int i=0 ; i < newStr.length; i++){
            int j = r.nextInt(newStr.length);

            char temp = newStr[i];
            newStr[i] = newStr[j];
            newStr[j] = temp;
        } 
        return new String(newStr);
    }
}