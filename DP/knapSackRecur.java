import java.util.Arrays;
import java.util.Scanner;

class knapSackRecur {
    public static int knapSack_reccursive(int[] wt, int[] val, int W, int n) {
        if (n == 0 || W == 0)
            return 0;
        else if (W >= wt[n - 1])
            return Math.max((val[n - 1] + knapSack_reccursive(wt, val, W - wt[n - 1], n - 1)),
                    (knapSack_reccursive(wt, val, W, n - 1)));
        else
            return knapSack_reccursive(wt, val, W, n - 1);
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
        System.out.println(knapSack_reccursive(wt, val, W, n));
        sc.close();
    }

}
