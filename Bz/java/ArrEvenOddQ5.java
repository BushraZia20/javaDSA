import java.util.*;
public class ArrEvenOddQ5 {
    public static void main(String[] args) {
        // count Even odd nums
        int[] arr = {10,45,56,12,16,19};
        Arrays.sort(arr);

        
        for(int i=0; i<arr.length;i++){
            int count = 1;
            for(int j = 0; i<arr.length;i++){
                if(arr[i]%2==0){
                System.out.println(arr[i]+"is even");
            }else{
                System.out.println(arr[i]+"is odd");
            }
            }
            
        }
    }
}
