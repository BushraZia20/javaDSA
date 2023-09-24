import java.util.Scanner;

public class C6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
         duplicates(arr, n);

    }
    public static int duplicates(int[] arr, int n){
        for(int i =0; i< n;i++){
            int count = 1;
            for(int j = 1; j < n; j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > 1){
                
                System.out.print(arr[i]+" ");
                 
            }
        }
        return -1;
    }
}
