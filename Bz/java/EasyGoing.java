import java.util.Scanner;

public class EasyGoing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        easyGoing(arr, n, m);
    }
    public static void easyGoing(int[] arr, int n, int m) {
        int x = n - m;
        System.out.println("n-m=" + x);

        int MinSum = 0;
        for (int i = 0; i < x; i++) {
            MinSum = MinSum + arr[i];
        }
        System.out.println("MinSum=" + MinSum);

         int MaxSum = 0;
        for (int i = n-1; i > m-1; i--) {
            MaxSum = MaxSum + arr[i];
        }
        System.out.println("MaxSum" + MaxSum);
        
        int Diff = MaxSum - MinSum;
        System.out.println("Diff" + Diff);
    }
}