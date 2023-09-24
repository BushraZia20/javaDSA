import java.util.Scanner;
//sorting 0s,1s,2s
public class C4Q2 {
    public static void Sorting(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int MinElIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[MinElIndex] > arr[j]) {
                    MinElIndex = j;
                }
            }
            if (MinElIndex != i) {
                int temp = arr[i];
                arr[i] = arr[MinElIndex];
                arr[MinElIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int[] arr = {0,1,2,0,2,1};
        Sorting(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
