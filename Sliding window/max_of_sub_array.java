import java.util.*;

public class max_of_sub_array {

    public static int maxSum(int[] arr, int n, int k) {
        int i = 0, sum = 0, maxS = Integer.MIN_VALUE;
        for (int j = 0; j < n; j++) {
            sum += arr[j];
            if (j - i + 1 == k) {
                maxS = Math.max(maxS, sum);
                sum -= arr[i];
                i++;
            }
        }
        return maxS;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(maxSum(arr, n, k));
        sc.close();
    }
}
