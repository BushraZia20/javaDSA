import java.util.*;

public class RightRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        for(int i = 0; i < 1; i++){
            int temp = arr[n-1];
            
            for(int j = n-1; j>0 ;j--){

                arr[j] = arr[j-1];
  

            }
            arr[0]= temp;
            
        }for(int i = 0; i < n; i++){
            System.out.print(arr[i]);
        }
        
    }
}
