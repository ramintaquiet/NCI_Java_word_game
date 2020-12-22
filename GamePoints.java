public class GamePoints {

//boolean match, isItValid;


private int playerPoints;


public int getplayerPoints() {
    return playerPoints;
  }

  // Setter
  public void setplayer1Points(int playerPoints) {
    this.playerPoints = playerPoints;
  }







    public void pointsInfo(boolean match, boolean isItValid) {

        System.out.println("============Points ========== ");
    
        if (match == true && isItValid == true) {
    
          System.out.println("Validation approved. You will get points  ");
       
        } else {
    
          System.out.println("Validation not apptoved. No points for you ");
        }
    
    
      }


     

    
}