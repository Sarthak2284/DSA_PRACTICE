import java.util.Scanner;

public class countOfElement {

    public static int countEle(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int firstIdx = -1;
        int lastIdx = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                firstIdx = mid;
                end = mid - 1;
            } else if (arr[mid] <= target) {
                lastIdx = mid;
                start = mid + 1;
            }
        }
        return lastIdx - firstIdx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(countEle(arr, target));
    }
}
