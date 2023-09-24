import java.util.*;

public class Arr(PlusOne) {
    public static int[] plusone(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                 digits[i]++;

                return digits;
            } else {
               digits[i] = 0;
            }
        }
        int[] dig = new int[digits.length + 1];
        dig[0] = 1;
        return dig;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        int[] res = plusone(digits);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);
        }

        sc.close();

    }

}
