import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Orgarr = new int[n];
        for (int i = 0; i < n; i++) {
            Orgarr[i] = sc.nextInt();
        }
        if (n > 0) {
            int[] Newarr = new int[n - 1];
            System.arraycopy(Orgarr, 1, Newarr, 0, Newarr.length);
            for (int i = 0; i < n-1; i++) {

                System.out.println(Newarr[i]);
            }

        }
    }
}