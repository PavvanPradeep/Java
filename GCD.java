package Java;
import java.util.*;
public class GCD {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=reader.nextInt();
        int b=reader.nextInt();
        System.out.println(gcd(a,b));
        reader.close();
    }
    public static int gcd(int a, int b){
        int hcf=0;
        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
}
