import java.util.*;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 2, 3, 4 };
        int n = arr.length;

        // for (int i = 0; i < n; i++) {

        // }
        int[] res = SortingBubble(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }

    }

    public static int[] SortingBubble(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[j - 1] < arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
