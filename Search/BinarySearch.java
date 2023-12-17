package Java.Search;
import java.util.*;
public class BinarySearch {
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
        int result = binarySearch(arr, x);
        if(result == -1) {
            System.out.println("Not found");
        }
        else {
            System.out.println("Found");
        }
        reader.close();
    }
    public static int binarySearch(int[] arr, int x){
        int l = 0, h = arr.length - 1;
        while(l <= h) {
            int mid = l + (h - l) / 2;
            if(arr[mid] == x) {
                return mid;
            }
            else if(arr[mid] < x) {
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }
        return -1;
    }
}
