public class Validate {

 
// VALIDATION NUMBER 1
//VALIDATION: Does the letters match in the word?
  public boolean checkWord(String randomString, String word) {

    System.out.println("VALIDATION 1");
    System.out.println("Doest the letters in word match the provided leters? ");

    for (int i = 0; i < word.length(); i++) {
      if (randomString.indexOf(word.charAt(i)) == -1) {
        System.out.println("No");
        return false;

      }
    }
    System.out.println("Yes");

    System.out.println("--------");

    return true;

  }


  // VALIDATION NUMBER 2
//VALIDATION: Does the word matched provided word?

  public boolean isValid(String myvar, String SA[]) {
    System.out.println("VALIDATION 2");
    System.out.println("Is this word a part of the Computer Vocaburary?");

    for (String name : SA) {

      if (name.equals(myvar)) {
        System.out.println("Yes");
        return true;
      }

    }
    System.out.println("No");
    System.out.println("--------");
    return false;

  }

}