import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class ArrSecLarQ2 {
  public static void main(String[] args) {
    // Find Second Largest Number in an Array

    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int[] arr = new int[n];
    // for (int i =0; i<arr.length; i++){
    // arr[i] = sc.nextInt();
    // }
    // Arrays.sort(arr);
    // int secL = arr[arr.length-2];
    // System.out.println(secL);

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int largest = arr[0];
    int secLar = arr[1];
    if (largest < secLar) {
      int temp = largest;
      largest = secLar;
      secLar = temp;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) {
        secLar = largest;
        largest = arr[i];
      } else if (arr[i] > secLar && arr[i] != largest) {
        secLar = arr[i];

      }
    }
    System.out.println(secLar);

  }
}
