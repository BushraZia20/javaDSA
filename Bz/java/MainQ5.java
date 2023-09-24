import java.util.*;

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            
            int[] a=new int[n];
            int[] b=new int[n];

            for(int i =0;i<n;i++){
                a[i]=sc.nextInt();
            }for(int i=0;i<n;i++){
                b[i]=sc.nextInt();

            }
            int totalCost=0;
            for(int i=0;i<n;i++){
                if(a[i]>=x){
                    totalCost+=b[i];
                }
            }
            System.out.println(totalCost);
        }
        sc.close();
    }
}