import java.util.*;
public class contestQ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for(int i =0; i < 2*n; i++){
            arr[i] = sc.nextInt();
        }
        int temp=0;
        for(int i =0; i<arr.length-1;i++){
            for(int j = 1; j< arr.length; j++){
               temp = arr[i]+arr[j];
               if(temp%2==0){
                break;
               }
            }
            
        }if(temp%2==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

    }
}