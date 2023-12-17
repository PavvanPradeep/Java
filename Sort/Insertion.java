package Java.Sort;
import java.util.*;
public class Insertion {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=reader.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){ 
            nums[i]=reader.nextInt();
        }
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
        reader.close();
    }
    public static int insertionSort(int[] nums){
        int n=nums.length;
        for(int i=1;i<n;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1]=nums[j];
                j=j-1;
            }
            nums[j+1]=key;
        }
        return 0;
    }
}
