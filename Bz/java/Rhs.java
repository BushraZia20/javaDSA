import java.util.Scanner;
public class Rhs {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
     int sa= sc.nextInt();
     int sb= sc.nextInt();
     int se= sc.nextInt();
     int sd= sc.nextInt();

     if (sa==sb&& sb==se&& se==sd&& sd==sa) {
        System.out.println("is a rhombus");
     } else {
        System.out.println("is not a rhs");
     }
    
     
    }
    
}
