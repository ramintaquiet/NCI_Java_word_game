
/**
 * ------- Find Computer Words Game ------------ by Raminta Kairyte x01416242
 * 
 * 
 */

public class GameMain {

        /**
         * This is the Main class - it contains the void main method, which starts the
         * game. The process of the game is contained in the GameController class, in
         * the method letsPlay(). The new instance of the GameController class is
         * created to be able to access the mehtod. When the instance is created, then
         * the method that evoked the process of the game is called and the then game
         * starts in the terminal.
         */

        // the main class of the whole application

        public static void main(String args[]) {

                // creating a new instance of the class GameController

                GameController newGame = new GameController();

                // the method that contains the process of the game is accesse via the instance.
                // then the game startst in the console Terminal.
                newGame.letsPlay();

                

          // the end of the main class
        }
        // the end of the GameMain class.
}