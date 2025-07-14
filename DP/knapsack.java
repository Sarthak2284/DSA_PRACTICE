package DP;

import java.util.*;

class knapsack {
    static int t[][];

    public static int knapsack_memo(int[] wt, int[] val, int W, int n) {
        if (n == 0 || W == 0)
            return 0;
        if (t[n][W] != -1)
            return t[n][W];
        if (wt[n - 1] <= W) {
            t[n][W] = Math.max(val[n - 1] + knapsack_memo(wt, val, W - wt[n - 1], n - 1),
                    knapsack_memo(wt, val, W, n - 1));
        }
        if (wt[n - 1] > W) {
            t[n][W] = knapsack_memo(wt, val, W, n - 1);
        }
        return t[n][W];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wt = new int[n];
        int[] val = new int[n];
        for (int i = 0; i < n; i++) {
            wt[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            val[i] = sc.nextInt();
        }
        int W = sc.nextInt();
        t = new int[n + 1][W + 1];
        for (int[] row : t)
            Arrays.fill(row, -1);
        System.out.println(knapsack_memo(wt, val, W, n));
        sc.close();
    }
}
