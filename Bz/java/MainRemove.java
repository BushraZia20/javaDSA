import java.util.Scanner;

public class MainRemove {
    //class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        if(n>0){
            int[] newArray = new int[n-1];
            System.arraycopy(arr,1,newArray,0,newArray.length);

           for(int i = 0;i< newArray.length;i++){
               System.out.println(newArray[i]);
               if(i<newArray.length-1){
                   System.out.print(" ");
               }
           }
           System.out.println();
            }else{
            System.out.println("The array is emepty");
        }
    }
}
