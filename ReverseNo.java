package Java;
import java.util.*;
public class ReverseNo {
    public static void main(String[] args){
        int n;
        Scanner reader= new Scanner(System.in);
        n = reader.nextInt();
        System.out.println(reverseno(n));
        reader.close();
    }
    public static int reverseno(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        return rev;
    }
}
