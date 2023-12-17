package Java;
import java.util.*;
public class Tower_of_hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        tower_of_hanoi(n, 'A', 'B', 'C');
        sc.close();
    }
    public static void tower_of_hanoi(int n,char source, char auxiliary, char destination){
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        tower_of_hanoi(n - 1, source, destination, auxiliary);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        tower_of_hanoi(n - 1, auxiliary, source, destination);
    }
    
}
