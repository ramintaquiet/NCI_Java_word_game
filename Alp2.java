
import java.util.*;

public class Alp2 {


   //method that generated the random String of 12 leters from the Alphabet.

    public String generateLetters() {


        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int n = alphabet.length(); //

        String result = new String();
        Random r = new Random(); // 11

        for (int i = 0; i < 12; i++) // 12
            result = result + alphabet.charAt(r.nextInt(n)); // 13

        return result.toLowerCase();


}

}