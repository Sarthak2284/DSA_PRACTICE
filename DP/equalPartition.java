import java.util.*;

public class equalPartition {

    static boolean[][] t;

    private static boolean canPartition(int[] arr, int sum, int n) {
        if (t == null || t.length != n + 1 || t[0].length != sum + 1) {
            t = new boolean[n + 1][sum + 1];
        }
        for (int i = 0; i <= n; i++) {
            t[i][0] = true;
        }

        for (int j = 1; j <= sum; j++) {
            t[0][j] = false;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] > j) {
                    t[i][j] = t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i - 1]];
                }
            }
        }
        return t[n][sum];
    }

    public static boolean canPartition(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0)
            return false;
        return canPartition(arr, sum / 2, arr.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(canPartition(arr) ? "true" : "false");
        sc.close();
    }
}
