import java.util.*;

public class FunctionQ1 {
    // Given an array of N size and a of value of X.find out the total number of
    // elements that are greater and lesser than the X.
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length;
        int x = 5;

        int[] a = LesserEl(arr, x);
        System.out.println("no. of el greater than x =" + a[0]);
        System.out.println("no. of el lesser than x ="+a[1]);
    }

    public static int[] LesserEl(int[] arr, int x) {
        int res1 = 0, res2=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                res1++;
            } else{
                res2++;
            }
        }
        int[] res ={res1,res2}; 
        return res;
    }

}
