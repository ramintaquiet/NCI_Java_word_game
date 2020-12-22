
import java.util.*;

public class Letters {


    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    


    public String generateLetters() {
     

        
        int n = alphabet.length(); // 

        String result = new String();
        Random r = new Random(); // 11

        for (int i = 0; i < 12; i++) // 12
            result = result + alphabet.charAt(r.nextInt(n)); // 13

        return result.toLowerCase();
    

}







}