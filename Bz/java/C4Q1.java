import java.util.*;

public class C4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i + 1] - arr[i] == 2) {
                System.out.println(arr[i] + 1);
                break;

            }
        }

    }
}
