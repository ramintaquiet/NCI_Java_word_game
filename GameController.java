
// Java APi Library: accessing Scanner
import java.util.Scanner;

/**
 * ------- Find Computer Words Game ------------ by Raminta Kairyte x01416242
 * 
 * -----
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
   * Here are the instances of the classes to be used to access the variables ad
   * methods
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

  // boolean variable to check of the entered word is one of the Computer Vocabulary words.
  private boolean matchWordInVocabulary;

  // indicate the current player
  private String currentPlayer;

  // random letters that the user needs to create a word from them. 
  private String lettersToCreateWord;

  // a word entered by the player
  private String enteredWord = "";

  // a variable that takes the answer from the user if another round wanted to be played.  Complient with the Rule MRA1.
  private String answerToContinue;

  // indcated and tracks the scored belonging to a certain player. 
  private int playerNumber = 1;

  //tracks players game entries per round.
  private int playerCounter = 1;

  // counts the number of rounds played. The starting number of round is 1. 
  private int roundCounter = 1;

  // Starting scores of both player at the begining of the game
  private int player1Score = 0;
  private int player2Score = 0;

  // -------------------------------------------------------------------
  // -------------------------------------------------------------------

  public void letsPlay() {

    Player1.setName("Player1");
    Player2.setName("Player2");

    lettersToCreateWord = alphabetLetters.generateLetters();

    System.out.println(" ===== welcome ==== ");

    startGame();

    // ================= checking letters
    System.out.println("============================== ");

    // myvar - word
    // leters - generated letters

    // System.out.println("Do you want to play again?");
    // answer = scn.next();

    System.out.println("=======The end ============== ");

    System.out.println("Total points per Game:");
    displayScore();
    System.out.println(" ");

    displayWinner();

  }

  // -------------------------------------------------------------------
  // -------------------------------------------------------------------

  public void startGame() {

    do {

      while (playerCounter < 3) {

        System.out.println("==========================================");
        System.out.println("random leters are: ");
        System.out.println("=======>  " + lettersToCreateWord + "  <========");
        displayRound();

        System.out.println(" Construct a computer related word with these letters");

        getCurrentPlayer();
        System.out.println("\n" + currentPlayer);

        System.out.println("enter a word: ");
        enteredWord = scanner.next().toLowerCase();

        // validation 1
        matchLetters = wordValidationForPoints.checkWordLetters(lettersToCreateWord, enteredWord);

        // validation 2

        String[] SA = myValidWords.getWords();
        matchWordInVocabulary = wordValidationForPoints.isValidInVocabulary(enteredWord, SA);

        System.out.println("POINTS INFO:");

        // playerPoints.pointsInfo(match, isItValid);
        pointsInfo();

        System.out.println("===============================");

        // givingScore();
        System.out.println("===============================");

        playerCounter++;

      }

      roundCounter++;

      System.out.println("Do you want to play another round?");
      answerToContinue = scanner.next();
      resetCounter();
      resetLeters();

    }

    // IDETI VALIDARIONS!!!!
    while (answerToContinue.equals("yes"));

  }

  // -------------------------------------------------------------------
  // -------------------------------------------------------------------

  // ----------------------------------------------------------------

  // -------------------?????------------------------------------

  public void getCurrentPlayer() {

    if (playerNumber == 1) {
      currentPlayer = Player1.getName();
      playerNumber += 1;
    } else {
      currentPlayer = Player2.getName();
      playerNumber -= 1;
    }
  }

  // -------------------------------------------------------

  // givingScore();
  // -------------------------------------------------------

  public void resetCounter() {
    playerCounter = 1;
  }

  // -------------------------------------------------------

  public void resetLeters() {

    lettersToCreateWord = alphabetLetters.generateLetters();
  }

  // -------------------------------------------------------

  public void displayScore() {
    System.out.println(Player1.getName() + " Score: " + player1Score);
    System.out.println(Player2.getName() + " Score: " + player2Score);
  }

  // -------------------------------------------------------
  public void givingScore() {

    if (currentPlayer.equals(Player1.getName()) && (enteredWord.charAt(0) == ('i') || enteredWord.charAt(0) == ('a')
        || enteredWord.charAt(0) == ('o') || enteredWord.charAt(0) == ('e') || enteredWord.charAt(0) == ('u')))

    {
      player1Score = player1Score + 3;

    } else if (currentPlayer.equals(Player1.getName())
        && (enteredWord.charAt(0) != ('i') || enteredWord.charAt(0) != ('a') || enteredWord.charAt(0) != ('o')
            || enteredWord.charAt(0) != ('e') || enteredWord.charAt(0) != ('u'))) {

      player1Score = player1Score + 1;

    } else if (currentPlayer.equals(Player2.getName())
        && (enteredWord.charAt(0) == ('i') || enteredWord.charAt(0) == ('a') || enteredWord.charAt(0) == ('o')
            || enteredWord.charAt(0) == ('e') || enteredWord.charAt(0) == ('u')))

    {

      player2Score = player2Score + 3;

    } else {
      player2Score = player2Score + 1;
    }

  }

  public void pointsInfo() {

    System.out.println("============Points ========== ");

    if (matchLetters == true && matchWordInVocabulary == true) {

      System.out.println("Validation approved. You will get points  ");
      givingScore();
      displayScore();

    } else {

      System.out.println("Validation not apptoved. No points for you ");
      displayScore();
    }

  }

  // -------------------------------------------------------

  public void displayWinner() {

    System.out.println("Total number of Rounds played: " + (roundCounter - 1));
    System.out.println(" ");

    if (player1Score > player2Score) {

      System.out.println("Player 1 is the Winner");
    } else if (player1Score < player2Score) {
      System.out.println("Player 2 is the Winner");
    } else {
      System.out.println("Both are the winners");
    }

  }

  // -------------------------------------------------------

  public void displayRound() {
    System.out.println("Current Round: " + roundCounter);

  }

  // =========
}