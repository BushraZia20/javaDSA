import java.util.*;

public class C5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int res = binarysearch(arr, n, k);
        if(res == -1){
            System.out.println("the element is not present in  the array");
        }else{
            System.out.println("element is present at   " +"index" + " "+ res);
        }
        
    }
    public static int binarysearch(int[] arr, int n, int k) {
        int low =0 ; int high = n-1;
        while(low<=high){
           int mid = (low+high)/2;
            if(arr[mid]==k){
                return mid;
            }
            if(arr[mid]<k){
                low= mid+1;
            }else{
                high= mid-1;
            }
        }
        return -1;
    }
}
    