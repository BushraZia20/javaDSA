import java.util.*;

public class C6Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int[] res = Sort012(arr, n);
        for(int i = 0; i<n; i++){
          System.out.print(res[i]+" ");
        }
    }
    public static int[] Sort012(int[] arr, int n){
        int largest = n-1;
        for(int i =0; i < n; i++){
          if(arr[i]>arr[largest]){
              int temp = arr[largest];
              arr[largest] = arr[i];
              arr[i] = temp;
          }
        }
        return arr;
        
      }
}
