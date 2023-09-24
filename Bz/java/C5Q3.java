import java.util.Scanner;

public class C5Q3 {
    public static void Largest(int[] arr, int n){
      int largest = arr[n-1];
      for(int i =0; i < n; i++){
        if(arr[i]>largest){
            int temp = largest;
            largest = arr[i];
        }
      }
      System.out.println(largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        Largest(arr, n);
    }
}
