package Java;
import java.util.*;
public class ReverseString{
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=reader.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
        reader.close();
    }
        
}