
// Java APi Library: accessing Scanner
import java.util.Scanner;

/**
 * ------- Find Computer Words Game ------------ by Raminta Kairyte x01416242
 * 
 * */

/**
 * The name of the class is GameController. This is the class contains the
 * action of the game program It has instances of other classes and uses their
 * methods and variables for the various actions of the game
 */
public class GameController {

  // default constructor. It doesnt take any parameters
  GameController() {
  }

  /**
   * Here are the instances of the classes to be used to access the variables and
   * the methods
   */

  Scanner scanner = new Scanner(System.in); // a new instance of the class Scanner (Java API Library)

  /**
   * Two instances of the GamePlayer class are created: Player1 and Player2. There
   * are only two players participating in the game accoring to the game
   * requirements.
   */
  GamePlayer Player1 = new GamePlayer(); // Player1 is an instance of the GamePlayer class
  GamePlayer Player2 = new GamePlayer(); // Player2 is an instance of the GamePlayer class

  /**
   * An new instance of the class GamePints Validation. The methods of this class
   * will be accessed to check if the entered word is valid according to the game
   * specifications and can receive any points.
   */
  GamePointsValidation wordValidationForPoints = new GamePointsValidation();

  /**
   * An new instance of the class validWords. This class contains the valid words
   * Vocabulary. Each entered word will be checked of it matches one of the values
   * in the Vocabulary array.
   */
  ValidWords myValidWords = new ValidWords();

  /**
   * An instance of a class GameRules. The method of this class will be used to
   * display the rules of the game for the players at the start of the game.
   */
  GameRules gameRules = new GameRules();

  /**
   * This is the new instance of the class Letters. The variables and methods will
   * be used to create random 12 letters from the English alphabeth for the user
   * to compose a word from.
   */
  Letters alphabetLetters = new Letters();

  // boolean variable to check if the entered word is composed using given letters
  private boolean matchLetters;

  // boolean variable to check of the entered word is one of the Computer
  // Vocabulary words.
  private boolean matchWordInVocabulary;

  // indicate the current player
  private String currentPlayer;

  // random letters that the user needs to create a word from them.
  private String lettersToCreateWord;

  // a word entered by the player
  private String enteredWord = "";

  // a variable that takes the answer from the user if another round wanted to be
  // played. Complient with the Rule MRA1.
  private String answerToContinue;

  // indcated and tracks the scored belonging to a certain player.
  private int playerNumber = 1;

  // tracks players game entries per round.
  private int playerCounter = 1;

  // counts the number of rounds played. The starting number of round is 1.
  private int roundCounter = 1;

  // Starting scores of both player at the begining of the game
  private int player1Score = 0;
  private int player2Score = 0;

  // -------------------------------------------------------------------
  // -------------------------------------------------------------------

  /**
   * The method where the main action of the game is set. It contains the game
   * flow and other helper methods.
   */
  public void letsPlay() {

    // --- STEP 1: Setting the Players

    // accessing the methods of the instantiated class GamePlayer.
    Player1.setName("Player1"); // giving the name to the Player nr1 (using setter method)
    Player2.setName("Player2"); // giving the name to the Player nr2 (using setter method)

    // --- STEP 2: Display the rules of The game

    // accessing the method of the instance class GameRules to display the rules of
    // the game

    gameRules.displayRules();

    // --- STEP 3: Generating 12 random letters for the players.

    // accessing the method of the instance class Letters to generate and display 12
    // random letters.
    lettersToCreateWord = alphabetLetters.generateLetters();

    // --- STEP 4: The method of the process of the game.

    /**
     * This method allows for the game to be played continuesly until the user stops
     * it. After each round, the user is asked to continue the game (to play another
     * round) [requirements rule MRA1] If the user wished to continue, the method is
     * initiated again and the user plays another round. If the user stops the game,
     * the method finished and STEP 5 is executed next.
     */

    startGame();

    // --- STEP 5: Once the game is terminated, display the received points and the
    // winner.

    // This is the end of the game. The game information (round count, points and
    // the winner) is displayed.
    System.out.println("  ");
    System.out.println("---THE--END--- ");
    System.out.println("---------------");

    // Here are the total points collected of each player per all rounds played
    // until the game was terminated.
    System.out.println("Total points per Game:");
    displayPoints(); // method to display each players total points
    System.out.println(" ");
    displayWinner(); // method to display the winner of the game. The winner the one who got more
                     // points

  }
  // the end of the method

  // ****************************************************************************************
  // ****************************************************************************************

  /**
   * This method allows for the game to be played continuesly until the user stops
   * it. After each round, the user is asked to continue the game (to play another
   * round) [requirements rule MRA1] If the user wished to continue, the method is
   * initiated again and the user plays another round. If the user stops the game,
   * the method finished and STEP 5 is executed next.
   */
  public void startGame() {

    // nested loops do and while-do.

    /**
     * First loop - do-while loop - Rule MRA1 This loop function is to execute the
     * roud again and again until the user wants to stop the game. At the end of
     * each round, the user is asked if wants to play another round. If wants to do
     * so, user needs to type "yes" into console. Another round will start. The user
     * can play as many rounds as wished while typing 'yes' to continue the game. By
     * pressing any key the game is terminated.
     * 
     */

    do { // start of the do-while loop

      /**
       * Second (nested) loop - while loop This is the counter loop. There are two
       * players in the game and each per round can enter only one word. That means
       * the game needs to ask to enter the word only two times - for the player nr 1
       * ad nr 2. This counter stops the round while it reached count of 3. The
       * begining of the count is 1 - this is when the game asked the Player 1 to
       * enter the word. Then it increase by one and becomes 2 and askes the Player2
       * to enter the word. Then it reached 3 ans stops the round (because there are
       * only 2 Players that needs to enter the word. )
       */
      while (playerCounter < 3) {
        System.out.println(" ");
        System.out.println("Construct a computer related word using these letters:");
        System.out.println(" ");
        System.out.print("Random leters are: ");
        System.out.println(" ");
        System.out.println(" ***  " + lettersToCreateWord + "  ***  "); // displaying 12 random letters

        /**
         * The method that displays the current round of the game, meaning the round
         * that is played at the moment. The count of the round starts from 1. It
         * increases with each round played by the players. When the game is terminated,
         * the number of total rounds played is displayeyes also.
         * 
         */
        displayRound();

        /**
         * This method is used to determine the current player of the game. The game has
         * two Players: Player 1 and Player 2. Each player is tracked by the indicator
         * variable playerNumber. When the playerNumber is set to 1, the Player 1 will
         * be displayed. When the playerNumber will be increase by one and set to 2,
         * then The Player 2 will be displayed. This method lets to swich between the
         * players in each round by increasing and decreasing the indicator variable.
         */
        getCurrentPlayer();
        System.out.println("\n" + currentPlayer); // display the player. "\n" displays in new line.

        /**
         * The player is asked to enter the word. The answer is taken by the Scanner
         * (Java Library) into a variable and used to validate the word (Validation
         * Rules nr1 and nr2). The answer will be valid either if it will be enter in
         * lower or upper case.
         */
        System.out.println("Enter a word: ");
        enteredWord = scanner.next().toLowerCase();

        // Validation Rule NR.1
        // Does the entered word's letters match the given letters?

        /**
         * Method accessed via the instance of the class GamePointsValidation This
         * method is checks if the players word is composed of given letters. The method
         * is boolean type, that means it returns true or false. IF the word is composed
         * of the given letters, the method return TRUE and will print a statement
         * "Yes". In case if it doesnt match, the method will return FALSE and print
         * "No" statement in the output. --- The method takes two parameters:
         * 
         * -- String lettersToCreateWord - this parameter is a random string letters,
         * that is provided to the player to compuse the word from.
         * 
         * -- String enteredWord - this parameter is the given word. The letters
         * (characters) of this word if compared with the values of the
         * randomStringLeters characters.
         * 
         */
        matchLetters = wordValidationForPoints.checkWordLetters(lettersToCreateWord, enteredWord);

        // Validation Rule NR.2
        // Is the entered word part of the Computer Valid Words Vocabulary?

        /**
         * Method accessed via the instance of the class GamePointsValidation
         * 
         * This method checks if the entered word belongs to the Approved Computer word
         * vocabulary. This method is boolean type, that means it returns either true or
         * false. It takes two String type parameters:
         * 
         * -- String enteredgWord - this is the word that the palyer entered. This word
         * will be looped through the array of the Vocabulary (ValidWords class) and
         * checked if each value matched the word. If the match is part of the
         * vacabulary (the match is found), then the boolean statement is TRUE and "Yes"
         * will be printed. If the words will go thought the whole loop and will not
         * find the match, that means that the word is not part of the vocabulary and
         * the boolean confition is false. The statement "No" will be printed on the
         * screen.
         * 
         * --String ComputerVocabulary[] - this is the array of words that the word will
         * be checked via loop. Each word (value) will be compared with the given word
         * starting from index 0 to the last element of the array.
         * 
         */

        // getting the Vocabulary array word from the instantated class.
        String[] ComputerVocabulary = myValidWords.getWords();
        // looking for the word to match
        matchWordInVocabulary = wordValidationForPoints.isValidInVocabulary(enteredWord, ComputerVocabulary);

        /**
         * This method displays the points information: amount of points each player
         * received. If the entered word passed both validation rules, that means if the
         * word is combined of the givenletters AND it is a part of the vocabulary, then
         * the player will receive the points. If none or only one of the validation is
         * fullfiled, the player will be given no points.
         */
        pointsInfo();

        System.out.println("  ");

        // The players counter is increased with each round. It is used in the while
        // loop to determine the player
        playerCounter++;

      } // the end of the while loop

      /**
       * The round counter is increased by one with each round. It is used to
       * determine the current round that is played and the total amount of rounds
       * played by the players.
       */
      roundCounter++;

      /**
       * Taking the user answer either to continue the game ad play another round or
       * not. The answer accepts any format of entry (either Upper or Lowe case) The
       * answer is used in the while loop: to terminate the game or continue with
       * another round Requirement rule of the Round is MRA1.
       */

      System.out.println("Round Rule: MRA1");
      System.out.println("Do you want to play another round?");
      System.out.println("Enter 'yes' to continue or press any key to stop the game");
      answerToContinue = scanner.next().toLowerCase(); // answer input by the Scanner (Java Library)

      /**
       * The method that resets the counter. Each round, the players start a fresh set
       * of game, that means they get new 12 letters displayed and new entried of the
       * word. When the players start the round, this method resets the counter for
       * the player to be able to enter the word again. The counter will set as the
       * Player 1 entry and 2 as the Player 2 entry. When the counter reaches 3, it
       * stops as each player can enter the word only once per round, so in total only
       * 2 entries per each round.
       */
      resetCounter();

      /**
       * This method resets the letters for each round. When a new round startts, they
       * players gets new set of letters to compose the word with. This method
       * generated new set of letters once the new method starts.
       */
      resetLetters();

    } // end of the do while loop

    /**
     * The condition of the do-while loop. With do-while loop, the statement is
     * executed at least once, that means that at least one round will be played. At
     * the end of the initial round, the players are asked if they want to play
     * another round. This is the condition and the input the answer. If the answer
     * is "Yes", the loop starts from the begining of the statemet.IF the player
     * pressed any key, the loop will terminate. NOTE: The player can enter both
     * lower or upper case answer.
     */
    while (answerToContinue.equals("yes"));

  } // the end of the class

  // ----------------------------------------------------

  /**
   * This method is used to determine the current player of the game. The game has
   * two Players: Player 1 and Player 2. Each player is tracked by the indicator
   * variable playerNumber. When the playerNumber is set to 1, the Player 1 will
   * be displayed. When the playerNumber will be increase by one and set to 2,
   * then The Player 2 will be displayed. This method lets to swich between the
   * players in each round by increasing and decreasing the indicator variable.
   */
  public void getCurrentPlayer() {

    if (playerNumber == 1) { // set to 1
      currentPlayer = Player1.getName(); // player nr1 is displayed
      playerNumber += 1; // when it increases by one
    } else {
      currentPlayer = Player2.getName(); // when the variable is increase, is becomes 2 and Player 2 is displayed
      playerNumber -= 1; // then is decrease by one and its back to player 1.
    }
  }

  // -------------------------------------------------------

  /**
   * This method is the implementation of the requirement rule RP4. The points a
   * given in the entered word passed two Validation rules. Then this word can
   * receive either 3 points of 1 point. 3 poins are given if the word's first
   * letter is a vowel. The English aplhabet has 5 vowels: a, e, i, o, u. If the
   * words starts with any of those letters, 3 points are given. In the case if a
   * word starts with the remaining letters (consonants, or non vowels), the
   * player is awarded with 1 point. To implement this method, an if/else
   * statement was used.
   * 
   */
  public void givingScore() {
    // if the begining of the word (first letter )of the Player 1 is a vowel ( a
    // letter i OR a OR o OR e OR u)
    if (currentPlayer.equals(Player1.getName()) && (enteredWord.charAt(0) == ('i') || enteredWord.charAt(0) == ('a')
        || enteredWord.charAt(0) == ('o') || enteredWord.charAt(0) == ('e') || enteredWord.charAt(0) == ('u')))

    {
      // then 3 points are added to the total sum of the player1 score.
      player1Score = player1Score + 3;

      // if the begining is NOT the vowel (any other letter rather than i, a, o, u, e)
    } else if (currentPlayer.equals(Player1.getName())
        && (enteredWord.charAt(0) != ('i') || enteredWord.charAt(0) != ('a') || enteredWord.charAt(0) != ('o')
            || enteredWord.charAt(0) != ('e') || enteredWord.charAt(0) != ('u'))) {
      // add 1 point to the total score for the Player 1.
      player1Score = player1Score + 1;

      // if the begining of the word of the Player 2 is a vowel ( a letter i OR a OR o
      // OR e OR u)
    } else if (currentPlayer.equals(Player2.getName())
        && (enteredWord.charAt(0) == ('i') || enteredWord.charAt(0) == ('a') || enteredWord.charAt(0) == ('o')
            || enteredWord.charAt(0) == ('e') || enteredWord.charAt(0) == ('u')))

    {
      // then 3 points are added to the total sum of the player2 score.
      player2Score = player2Score + 3;

    } else {
      // otherwise, 1 point is added to the player 2 to the total scores.
      player2Score = player2Score + 1;
    }

  } // the end of the method

  // -------------------------------------------------------

  /**
   * This method displays the points information. If the entered word passed both
   * validation rules, that means if the word is combined of the givenletters AND
   * it is a part of the vocabulary, then the player will receive the points. If
   * none or only one of the validation is fullfiled, the player will be given no
   * points.
   * 
   */
  public void pointsInfo() {
    System.out.println("  ");
    System.out.println("-----------Points Information----------- ");
    // if the both (AND) boolean variables are set to true (both conditions
    // fullfiled)
    if (matchLetters == true && matchWordInVocabulary == true) {
      // Information printed that the points will be given
      System.out.println("Validation approved. You will get points  ");
      System.out.println("Rule to award points: RP4  ");
      givingScore(); // the method to give points in enabled.
      displayPoints(); // the method to display points.

    } else {
      // Information printed that the points will not be given
      System.out.println("Validation not approved. No points for you :( ");
      displayPoints(); // the method to display points.
      // NOTE: If points are not given, the score is displayed at its original state,
      // which is 0 (zero).
    }

  }
  // -------------------------------------------------------

  /**
   * This method is to display the points of each player Each players name is
   * called by using the getter method. The int variables of players score
   * indicated the points given to the player. Each round the received points are
   * added up to the total sum. When the game is terminated, the total amount of
   * points are displayed. The winner is the one who got the most points. The
   * method displayWinner uses player score variables to determine the winner.
   */
  public void displayPoints() {
    System.out.println(Player1.getName() + " Score: " + player1Score); // Player 1 score
    System.out.println(Player2.getName() + " Score: " + player2Score); // Player 2 score
  } // the end of the method

  // -------------------------------------------------------

  /**
   * This method is used to determine the winner of the game. It is enabled only
   * after the game is terminated. The winer of the game is the one who got the
   * most points. The Players Score variables are used to compare and determine
   * the winner. If both winners got equal amaout of points, both of them are
   * annonced as winners.
   */
  public void displayWinner() {
    /**
     * indicating the round count. Displays the amount of rounds played. When the
     * round is terminated, the round counter still adds one cound to the sum, so to
     * determine the correct number of rounds played, one rounded is taken from the
     * total amount.
     */
    System.out.println("Total number of Rounds played: " + (roundCounter - 1));
    System.out.println(" ");
    // determining the winner using else if statements
    if (player1Score > player2Score) {
      // IF the Player one got more scores
      System.out.println("Player 1 is the Winner");
      // IF the Player 2 got more scores
    } else if (player1Score < player2Score) {
      System.out.println("Player 2 is the Winner");
      // if the scores are equal
    } else {
      System.out.println("Both are the winners");
    }

  } // end of the method

  // ----------------------------------------------------------
  /**
   * This method displays the current round played by the players. It is displayed
   * before each player has to enter the word. It uses the variable roundCounter
   * which is increased with each round.
   */
  public void displayRound() {
    System.out.println("Current Round: " + roundCounter);

  } // the end of the method

  // ----------------------------------------------------------
  /**
   * The method that resets the counter. Each round, the players start a fresh set
   * of game, that means they get new 12 letters displayed and new entried of the
   * word. When the players start the round, this method resets the counter for
   * the player to be able to enter the word again. The counter will set as the
   * Player 1 entry and 2 as the Player 2 entry. When the counter reaches 3, it
   * stops as each player can enter the word only once per round, so in total only
   * 2 entries per each round.
   */
  public void resetCounter() {
    playerCounter = 1;
  }

  // -------------------------------------------------------

  /**
   * This method resets the letters for each round. When a new round startts, they
   * players gets new set of letters to compose the word with. This method
   * generated new set of letters once the new method starts.
   */
  public void resetLetters() {
    lettersToCreateWord = alphabetLetters.generateLetters();
  }

  // ========= the end of the class ===========================
}