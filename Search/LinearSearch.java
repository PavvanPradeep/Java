package Java.Search;
import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter size");
        int n = reader.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter value:");
        for(int i = 0; i < n; i++) {
            arr[i] = reader.nextInt();
        }
        System.out.println("Enter the element to search");
        int x = reader.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                System.out.println("Found");
                break;
            }
            else if(i==n-1){
                System.out.println("Not found");
            }
        }
        reader.close();
    }
}
