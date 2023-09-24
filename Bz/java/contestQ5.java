import java.util.*;
public class contestQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int X = 0;
        int temp=0;
        for(int i =0; i<arr.length-1;i++){
            for(int j = 1; j< arr.length; j++){
               temp = arr[i]+arr[j];

            }
        }
        if(X<temp){
            int temporary = X;
            X = temp;
            temp = temporary;
        }
        System.out.println(X);
        
            
        

    }
}