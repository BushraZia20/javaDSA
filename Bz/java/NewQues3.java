import java.util.Scanner;

public class NewQues3 {
    /*
   Write a program to check whether a triangle is valid or not if angles are given using if else.
    How to check whether a triangle can be formed or not, if its angles are given using if else in java programming.
    Logic to check triangle validity if angles are given in program.
     */
     public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= 90 || a >= 90 && b < 90 && c < 90) {
            System.out.println("it is a valid tri");
        } else {
           System.out.println("it is not valid tri");
        }

     }
}
