public class minimumSubsetSum {
    public static int minSSD(int[] arr) {
        int total = 0;
        for (int ele : arr)
            total += ele;
        int half = total / 2;
        boolean[] dp = new boolean[half + 1];
        dp[0] = true;
        for (int num : arr) {
            for (int j = half; j >= num; j--) {
                if (dp[j - num])
                    dp[j] = true;
            }
        }

        for (int j = half; j >= 0; j--) {
            if (dp[j])
                return total - 2 * j;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 6, 11, 5 };
        System.out.println(minSSD(arr));
    }
}
