import java.util.*;

public class find2Repeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 2];

        for (int i = 0; i < n + 2; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> duplicate = new ArrayList<>();
        for (int i = 0; i < n + 2; i++) {
            int index = Math.abs(arr[i]);
            if (arr[index] < 0)
                duplicate.add(index);
            else
                arr[index] = -arr[index];
        }

        for (int ele : duplicate) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}

// 1 2 4 3 2 4 index:- 1