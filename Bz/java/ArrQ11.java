import java.util.Scanner;
import java.util.Arrays;

public class ArrQ11 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int target = sc.nextInt();
        for(int i = 0; i<arr.length;i++){
            for (int j =1; j<arr.length;j++){
                if (arr[i]+arr[j] == target && arr[i]<arr[j]){
                    System.out.println(arr[i]+"+"+arr[j]+"="+target);
                  
                } 
            } 
        } 
    }
}
