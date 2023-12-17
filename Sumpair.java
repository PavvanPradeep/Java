package Java;
import java.util.*;
public class Sumpair {
    public static void findPair(int[] nums, int target){
        Arrays.sort(nums);
        int low = 0;
        int high = nums.length - 1;
        while (low < high){
            if (nums[low] + nums[high] == target){
                System.out.printf("Pair found (%d, %d)", nums[low], nums[high]);
                return;
            }
            if (nums[low] + nums[high] < target) {
                low++;
            }
            else {
                high--;
            }
        }
        System.out.println("Pair not found");
    }
    public static void main (String[] args){   
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n,m;
        n=reader.nextInt();
        m=reader.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<=n;i++){ 
            nums[i]=reader.nextInt();
        }
        findPair(nums, m);
        reader.close();
    }
}
