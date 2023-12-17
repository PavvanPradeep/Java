package Java;
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=reader.nextInt();
        System.out.println(fib(n));
        reader.close();
    }
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
}
