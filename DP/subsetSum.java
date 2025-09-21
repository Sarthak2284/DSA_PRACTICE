import java.util.*;

public class subsetSum {
    static boolean[][] t;

    public static boolean subset(int[] arr, int sum, int n) {
       //Initialization
        if (t == null || t.length != n + 1 || t[0].length != sum + 1) {
            t = new boolean[n + 1][sum + 1];
        }

        //Base Case
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(subset(arr, target, n) ? "Yes" : "No");
        sc.close();
    }
}
