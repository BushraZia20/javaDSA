import java.util.*;

public class C5Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i = 0; i<n; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            B[i] = sc.nextInt();
        }
        
        boolean res = Check(A, B);
        if(res == true){
            System.out.println("1");
        }else{
            System.out.println("0");
        }

    }
    public static boolean Check(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++){
            if(A[i]==B[i]){
                return true;
            }
        }
        return false;
    }
}
