import java.util.*;

public class DistinctColours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int k = 0; k < t; k++){
            int n = sc.nextInt();
            int[] DistColours = new int[n];
            for(int i =0; i < n ; i++){
                DistColours[i] = sc.nextInt();
            }
            Arrays.sort(DistColours);
            for(int i = 0; i < n; i++){
                if(i==n-1){
                    System.out.println("min boxes needed = ");
                    System.out.println(DistColours[i]);
                }
            }
        }
    }
}
