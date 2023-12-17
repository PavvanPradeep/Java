package Java.Sort;
import java.util.*;
public class RadixSort {
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=reader.nextInt();
        int[] nums = new int[n];
        for(int i =0;i<n;i++){ 
            nums[i]=reader.nextInt();
        }
        radixSort(nums);
        System.out.println(Arrays.toString(nums));
        reader.close();
    }
    public static int radixSort(int[] sums){
        int max = sums[0];
        for(int i = 1; i < sums.length; i++){
            if(sums[i] > max){
                max = sums[i];
            }
        }
        for(int exp = 1; max/exp > 0; exp *= 10){
            countSort(sums, exp);
        }
        return 0;
    }
    public static int countSort(int[] sums, int exp){
        int[] output = new int[sums.length];
        int[] count = new int[10];
        for(int i = 0; i < sums.length; i++){
            count[(sums[i]/exp)%10]++;
        }
        for(int i = 1; i < 10; i++){
            count[i] += count[i-1];
        }
        for(int i = sums.length-1; i >= 0; i--){
            output[count[(sums[i]/exp)%10]-1] = sums[i];
            count[(sums[i]/exp)%10]--;
        }
        for(int i = 0; i < sums.length; i++){
            sums[i] = output[i];
        }
        return 0;
    }
}
