package Java.Sort;
import java.util.*;
public class Quick {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=reader.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){ 
            nums[i]=reader.nextInt();
        }
        quickSort(nums,0,n-1);
        System.out.println(Arrays.toString(nums));
        reader.close();
    }
    public static int quickSort(int[] num, int low, int high){
        if (low < high) {
            int pi = partition(num, low, high);
            quickSort(num, low, pi - 1);
            quickSort(num, pi + 1, high);
        }
        return 0;
    }
    public static int partition(int[] num, int low, int high){
        int pivot = num[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (num[j] < pivot) {
                i++;
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        int temp = num[i + 1];
        num[i + 1] = num[high];
        num[high] = temp;
        return i + 1;
    }

}
