import java.util.Arrays;
public class CompareString {

String str = "qwertyuio";
String str1 = "qwer";

public void compare() {
    char[] firstString = str.toLowerCase().toCharArray();
    char[] secondString = str1.toLowerCase().toCharArray();

    Arrays.sort(firstString);
    Arrays.sort(secondString);

    if (Arrays.equals(firstString, secondString) == true) {
        System.out.println("Both the string contain same charecter");
    } else {
        System.out.println("Both the string contains different charecter");
    }
}

public static void main(String[] args) {
    CompareString compareString = new CompareString();
    compareString.compare();
}
}