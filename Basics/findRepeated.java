import java.util.*;

public class findRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int arrSum = 0;
        for (int i = 0; i < n + 1; i++) {
            arr[i] = sc.nextInt();
            arrSum += arr[i];
        }
        int naturalSum = (n * (n + 1)) / 2;
        System.out.println(arrSum - naturalSum);
        sc.close();
    }
}