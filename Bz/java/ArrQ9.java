import java.util.*;
public class ArrQ9 {
    public static void main(String[] args) {
         // Java Program to find the top two maximum numbers in an array.
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
       
         int Lar = arr[0];
        int SecLar = arr[1];
        if(Lar<SecLar){
             int temp = Lar;
             Lar = SecLar;
             SecLar = temp;
        }
       

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>Lar){
                SecLar = Lar;
                Lar = arr[i];
                    System.out.println(Lar*SecLar);
            }else if (arr[i]>SecLar && arr[i]!=Lar){
               SecLar =  arr[i];
                    System.out.println(Lar*SecLar);
            }

        }
        
            // Write a Java program to find the maximum product of two integers in a given array of integers.
            // Arrays.sort(arr);
            // int mul = arr[arr.length-1]*arr[arr.length-2];
            // System.out.println(mul);

        }

   
   

}
