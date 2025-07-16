import java.util.*;

public class knapSack_top_down {
    public static int knapSackOptimized(int[] wt, int[] val, int W, int n) {
        int[] dp = new int[W + 1];

        for (int i = 0; i < n; i++) {
            for (int w = W; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
            }
        }

        return dp[W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of items
        int[] wt = new int[n]; // weight array
        int[] val = new int[n]; // value array

        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }

        int W = sc.nextInt(); // capacity of knapsack

        int result = knapSackOptimized(wt, val, W, n);
        System.out.println(result); // print the result
    }
}
