package Java;
import java.util.*;
public class StringRotation {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter original String");
        String input = reader.nextLine();
        System.out.println("Enter rotation of String");
        String rotation = reader.nextLine();
        if (checkRotatation(input, rotation)) {
            System.out.println("YES");
        } 
        else {
            System.out.println("NO");
        }
        reader.close();
        
    }
    public static boolean checkRotatation(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;
        }
        String concatenated = original + original;
        if (concatenated.indexOf(rotation) != -1) {
            return true;
        }
        return false;
      }
}
