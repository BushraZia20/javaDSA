  import java.util.*;

    public class ArrSumQ1 {
  
    public static void main(String[] args) {
    //   Compute Sum and Average of Array Elements.
    Scanner sc = new Scanner(System.in);
     int sum;
     float av; 
    
       sum = 0;
     
          System.out.println("size of array - ");
    int n = sc.nextInt(); 
    int[] arr = new int[n];
    
    for (int i = 0; i<arr.length;i++){
        // System.out.println("no. of el in array");
        arr[i] = sc.nextInt();
    } 
    for (int i = 0; i<arr.length; i++){
      sum = sum + arr[i];
      System.out.println("sum="+sum);
       
    }
     av =(float) sum/arr.length;
        System.out.println("average=" +av);
    
    }
}

