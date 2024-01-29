package Java;
import java.util.*;

public class Sum_Minimum_Subarrays {
    public static int sum_of_minimums(List<Integer> nums) {
        int MOD = (int)1e9+7;
        int n = nums.size();
        long result = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int min = Integer.MAX_VALUE;
                for (int k = i; k <= j; k++) {
                    min = Math.min(min, nums.get(k));
                }
                result = (result + min) % MOD;
            }
        }

        return (int) result;
    }
}
