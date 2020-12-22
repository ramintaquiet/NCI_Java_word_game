import java.util.*;

public class GameController {

  // the main action of the programm is here

  Scanner scn = new Scanner(System.in);

  GamePlayer Player1 = new GamePlayer();
  GamePlayer Player2 = new GamePlayer();
  Validate wordValidation = new Validate();
  ValidWords myValidWords = new ValidWords();
  GamePoints playerPoints = new GamePoints();

  Letters ABC = new Letters();

  public int playerNumber = 1;
  public String currentPlayer;

  String letters;
  String enteredWord = "";
  String answer;
  int counter = 1;

  boolean match;
  boolean isItValid;

  int p1score = 0;
  int p2score = 0;

  int roundCounter = 1;

  // -------------------------------------------------------

  public void letsPlay() {

    Player1.setName("Player1");
    Player2.setName("Player2");

    letters = ABC.generateLetters();

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

  public void startGame() {

    do {

      while (counter < 3) {

        System.out.println("==========================================");
        System.out.println("random leters are: ");
        System.out.println("=======>  " + letters + "  <========");
        displayRound();

        System.out.println(" Construct a computer related word with these letters");

        getCurrentPlayer();
        System.out.println("\n" + currentPlayer);
      
        System.out.println("enter a word: ");
        enteredWord = scn.next().toLowerCase();
        warning();
        
      

        // validation 1
        match = wordValidation.checkWord(letters, enteredWord);

        // validation 2

        String[] SA = myValidWords.getWords();
        isItValid = wordValidation.isValid(enteredWord, SA);

        System.out.println("POINTS INFO:");

        playerPoints.pointsInfo(match, isItValid);

        System.out.println("===============================");

        givingScore();
        System.out.println("===============================");

        counter++;

      }

      roundCounter++;

      System.out.println("Do you want to play another round?");
      answer = scn.next();
      resetCounter();
      resetLeters();

    }

    while (answer.equals("yes"));

  }

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
    counter = 1;
  }

  // -------------------------------------------------------

  public void resetLeters() {

    letters = ABC.generateLetters();
  }

  // -------------------------------------------------------

  public void displayScore() {
    System.out.println(Player1.getName() + " Score: " + p1score);
    System.out.println(Player2.getName() + " Score: " + p2score);
  }

  // -------------------------------------------------------
  public void givingScore() {

    if (currentPlayer.equals(Player1.getName()) && (enteredWord.charAt(0) == ('i') || enteredWord.charAt(0) == ('a')
        || enteredWord.charAt(0) == ('o') || enteredWord.charAt(0) == ('e') || enteredWord.charAt(0) == ('u')))

    {
      p1score = p1score + 1;

    } else if (currentPlayer.equals(Player1.getName())
        && (enteredWord.charAt(0) != ('i') || enteredWord.charAt(0) != ('a') || enteredWord.charAt(0) != ('o')
            || enteredWord.charAt(0) != ('e') || enteredWord.charAt(0) != ('u'))) {

      p1score = p1score + 3;

    } else if (currentPlayer.equals(Player2.getName())
        && (enteredWord.charAt(0) == ('i') || enteredWord.charAt(0) == ('a') || enteredWord.charAt(0) == ('o')
            || enteredWord.charAt(0) == ('e') || enteredWord.charAt(0) == ('u')))

    {

      p2score = p2score + 1;

    } else {
      p2score = p2score + 3;
    }

    displayScore();

  }

  // -------------------------------------------------------

  public void displayWinner() {

    System.out.println("Total number of Rounds played: " + (roundCounter - 1));
    System.out.println(" ");

    if (p1score > p2score) {

      System.out.println("Player 1 is the Winner");
    } else if (p1score < p2score) {
      System.out.println("Player 2 is the Winner");
    } else {
      System.out.println("Both are the winners");
    }

  }

  // -------------------------------------------------------

  public void displayRound() {
    System.out.println("Current Round: " + roundCounter);

  }

  public void warning() {

    if(enteredWord.equalsIgnoreCase(enteredWord))
    {
      System.out.println("This is the same word!");
    }
  }



  // =========
}