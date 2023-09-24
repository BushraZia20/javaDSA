import java.util.*;
public class ArrQ12 {
   public static void main(String[] args) {
    //{20,30,20,4,5}
    int[] arr = {20,30,20,4,5}; //{4,5,20,30}
    Arrays.sort(arr);
   //  int count = 1;
   //  for (int i = 0; i<arr.length; i++){
       
   //           if (arr[i]!=arr[i-1]){
   //              arr[count]=arr[i];
   //              count++;
   //           }
   //               System.out.println(arr[count]);
   //      }
       
      // int[] temp = new int[arr.length];

      // for (int i =0; i<arr.length-2;i++){
      //    temp[i]=arr[i];
      // }
      // for (int i=0; i<)


       // int[] arr ={4,5,20,20,30};
        //int n = arr.length;

        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                arr[count++] =arr[i];
            }
        }
        arr[count++] = arr[arr.length-1];  // {4,5,20,30}
        for(int i =0;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

  
   

