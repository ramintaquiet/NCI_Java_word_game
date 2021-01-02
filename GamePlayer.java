
/** 
 *  * ------- Find Computer Words Game ------------ by Raminta Kairyte x01416242
 * 
 * ----
 * 
 * 
 * This is the Players class. The game has two players. 
 * The name of the players will indicte which player collect certain amount of points 
 * which player won or lost the game. 
 * The class has to be instantiated in order for the getter and setter methods
 * to be in use. 
 * 
 * 
 */
public class GamePlayer {

   
/** 
 * This is the String variable "name".
 * Is variable will be used to define each player of the game. 
 * This variable has private access modifier so it is accessable only within this class. 
 * In the GameController class, the name will be given to each player (by setName method)
 * and the name will be retrieved (by getName method)
 * 
 */
private String nameOfThePlayer;


/**  This is the default constructor. It doesnt take any values. 
 Java provided this constructor by default but in case in the future if a constructor that takes
 vaklus will be initiated, the initiated default constructor will not currupt the code. 
 */
GamePlayer() {}

      
      /** This is the Getter method
       * Once this class is instantiaed, this method helps to access the the private String value name.
       * This method has a public access modifier so it is accessible in any class (that has instance of this class)
       * among the whole application. 
       * Using this method, the names of the Player will be get in the GameController class. 
       */
  public String getName() {
    return nameOfThePlayer;
  }

      
      /** This is the Setter method
       * Once this class is instantiaed, this method helps to set the private String value name.
       * This method has a public access modifier so it is accessible in any class (that has instance of this class)
       * among the whole application. 
       * Using this method, the names of the Player will be set in the GameController class. 
   */


  public void setName(String newName) {
    this.nameOfThePlayer = newName;
  }

  // the end of the class

    
}