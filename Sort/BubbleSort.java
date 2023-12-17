package Java.Sort;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=reader.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){ 
            nums[i]=reader.nextInt();
        }
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
        reader.close();
    }
    public static int bubbleSort(int[] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return 0;
    }
}
