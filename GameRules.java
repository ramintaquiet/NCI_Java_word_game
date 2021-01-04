public class GameRules {

/**
 * ------- Find Computer Words Game ------------ by Raminta Kairyte x01416242
 * 
 * */

 // This is a default constructor. It doesnt take any parameters. 
GameRules() {}


/** This method dispays the Rules of the game
 * The GameRules class has to be instantated, only then this method becomes availabe to be used.
 * This method id used in the GameController class at the begining of the game to display the rules of the game for the player. 
 */
public void displayRules() {

    System.out.println("  ");
    System.out.println("  ");
    System.out.println(" ---------- WELCOME ---------- ");
    System.out.println(" ");
    System.out.println("---FIND COMPUTER WORDS GAME--- ");
    System.out.println("--------RULES:-------- ");
    System.out.println("  1. There are two players in the game. Each player needs to create a computer related word from the given letters. ");
    System.out.println("  2. Before each round the player are given 12 random letters. The word needs to be created only those letters. ");
    System.out.println("  3. The Points are given only of the entered word passes two validation rules ");
    System.out.println("  4. Validation Rule nr 1: The word has to be created using oly those given letters ");
    System.out.println("  5. Validation rule nr 2: The word has to be one of the Valid Computer Words Vocabulary ");
    System.out.println("  6. The points are give according to the Rule NR RP4: Begins with a vowel: 3 poits; begins with a consonant: 1 point.");
    System.out.println("  7. After each round, the  Game is askig the players if they want to play another round or finish the game. "); 
    System.out.println("  8. The winner of the game becomes the one who collects the most points. The winner is announced when the game is ended."); 
    System.out.println("  "); 
    System.out.println("----GOOD--LUCK--- ");
    System.out.println(" "); 
    

}

// the end of the class

}