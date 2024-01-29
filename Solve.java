package Java;
import java.util.ArrayList;
import java.util.List;

public class Solve {
    public static List<Integer> solve(List<Integer> a) {
        int n = a.size();
        List<Integer> finalMoney = new ArrayList<>(n);
        int[] minLeft = new int[n];
        int[] maxRight = new int[n];
        minLeft[0] = a.get(0);
        for (int i = 1; i < n; i++) {
            minLeft[i] = Math.min(minLeft[i - 1], a.get(i));
        }
        maxRight[n - 1] = a.get(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], a.get(i));
        }
        for (int i = 0; i < n; i++) {
            finalMoney.add(a.get(i) + maxRight[i] - minLeft[i]);
        }
        return finalMoney;
    }
}
