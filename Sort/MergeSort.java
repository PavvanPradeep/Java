package Java.Sort;
import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=reader.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){ 
            nums[i]=reader.nextInt();
        }
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
        reader.close();
    }
    public static int mergeSort(int arr[] ){
        int n = arr.length;
        if(n < 2){
            return 0;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for(int i = 0; i < mid; i++){
            left[i] = arr[i];
        }
        for(int i = mid; i < n; i++){
            right[i-mid] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
        return 0;
    }
    public static int merge(int[] arr, int[] left, int[] right){
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i < left.length){
            arr[k++] = left[i++];
        }
        while(j < right.length){
            arr[k++] = right[j++];
        }
        return 0;
    }
}
