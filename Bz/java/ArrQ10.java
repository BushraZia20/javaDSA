import java.util.Arrays;

public class ArrQ10 {
    public static void main(String[] args) {
        //Write a Java program to copy an array by iterating the array
        
        int[] arr = {45,55,8,6,8,8,57,2};
        int[] temp = new int [arr.length];
       
        for(int i =0; i< arr.length; i++){
            temp[i]=arr[i];
        }
        // System.out.println("elements of original array");
        // for(int i =0; i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println("\ncopied array");
        // for (int i= 0; i<temp.length;i++){
        //     System.out.print(temp[i]+" ");
        // }

        //OR
        String t = Arrays.toString(temp);
        System.out.println(t);
    }
}
