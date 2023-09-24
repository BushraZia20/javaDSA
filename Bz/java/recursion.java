import java.util.*;


public class recursion {
    public static void main(String[] args) {
     int res =sequence(5);
     System.out.println(res);

    }
   
   //   static int sum(int n) {   //  5= 5*4*3*2*1
   //       if(n<0){
   //          return 0;
   //       }else {
   //          return n+sum(n-1) ;   //   10        9

   //       }
            
   //      }
   public static int sequence(int N){
      if(N==0){
         return 1;
      }else{
         return N*sequence(N-1);
      }
   }
}
