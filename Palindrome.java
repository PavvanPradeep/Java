package Java;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        palindrome();
    }
    public static void palindrome(){
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=reader.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
        reader.close();
    }

}
