public class ArrMedianQ15 {
    // How to find a median of two sorted arrays?
    public static void main(String[] args) {
    //    int[] arr1 = {1,2,5,6,9};
        int[] arr1 = {3,4,6,8};
        FindMedian( arr1) ;
        System.out.println(arr1);
    }
    public static void FindMedian(int[] arr1){
        int n = arr1.length;
        // int n2= arr2.length;
        // int ans = 0;
        for(int i= 0; i<n; i++){
          if(n%2!=0){
          arr1[n]/=2;
        }   
        }
        //else{
        //    (arr[(n-1)/2]+arr[n/2])/2;
        // }
        //  return  ;

    }
}
