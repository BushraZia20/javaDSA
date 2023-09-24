import java.util.Scanner;

public class contestQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i <= t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
           
            int count = 0;
            for(int j = 0; j < n; j++){
                if(arr[j] >= k){
                    count ++;
                }
            }
            System.out.println(count);
        }

    }
}
