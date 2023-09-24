
    import java.util.*;
public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = { 1,3,7,9,11,12,45 };
        int x = 3;
        //int res = SearchBinary(arr, x);
        int res= search(arr, x);
        if(res == -1){
            System.out.println("the element is not present in  the array");
        }else{
            System.out.println("element is present at   " +"index" + " "+ res);
        }

    }

    // public static int SearchBinary(int[] arr, int x) {
    //     int left = 0;
    //     int right = arr.length - 1;
    //     while (left <= right) {
    //         int mid =( left + right )/ 2;
    //         if (arr[mid] == x) {
    //             return mid;
    //         }
    //         if (arr[mid] < x) {
    //             left = mid + 1;
    //         } else {                    //mid>x
    //             right = mid - 1;
    //         }

    //     }
    //     return -1;
    // }
    public static int search(int []nums, int target) {
        // Write your code here.
        int n = nums.length;
        int low =0 ; int high = n-1;
        while(low<=high){
           int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                low= mid+1;
            }else{
                high= mid-1;
            }
        }
        return -1;
    }
}


