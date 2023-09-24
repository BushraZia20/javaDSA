import java.util.*;

public class ArrDupQ4 {
    public static void main(String[] args) {
        // count the duplicacy
        int[] arr = { 10, 10, 14, 14, 14, 12, 12 };

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

                // else {
                // if (count =1) ;
                // System.out.println(arr[i]+"-"+count);

                // }
                //

            }
            if (count > 1) {
                System.out.println(arr[i] + "-" + count);
                i += (count - 1);
            }
        }

    }

}
