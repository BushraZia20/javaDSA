import java.util.*;
public class Ques4b {
     public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //  System.out.println("Input first number:");
    //     int d1= sc.nextInt();
    //    System.out.println("input second number");
    //     int d2= sc.nextInt();
        
        
    //     System.out.println(d1+"*"+d2+"="+d1*d2);
    Scanner sc = new Scanner(System.in);
    System.out.println("input first number");
    int d1 = sc.nextInt();
    System.out.println("input second number");
    int d2 = sc.nextInt();

    SolveThis(d1, d2);

     }
     public static void SolveThis(int d1, int d2 ){
        int Solve = d1*d2;
        System.out.println(d1+"*"+d2+"="+Solve);
     }

}
