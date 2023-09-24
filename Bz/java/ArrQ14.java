import java.util.*;
public class ArrQ14 {
    // Write a Java program to sort a numeric array and a string array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the Array");
        int N = sc.nextInt();

        int[] arr = new int[N];
        System.out.println("elements of the original array");
        for(int i= 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("elements of the sorted array"+Arrays.toString(arr));

    }
}