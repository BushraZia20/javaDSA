import java.util.*;
public class CheckNeg {
    // 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i =0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int res = CheckNegative(arr);
        if(res!=-1){
            System.out.println("yes");
        }else{
            System.out.println("no");
        } 


    }
       
       public static int CheckNegative(int[] arr){
         for(int i = 0; i < arr.length; i++){
            if(arr[i] <0){
              return arr[i];
            }

        }
        return -1;
       }
    }

