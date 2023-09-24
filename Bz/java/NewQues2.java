import java.util.Scanner;

public class NewQues2 {
    /*
     * Write a program that takes three integers as input and determines the largest
     * of the three numbers. Implement the program using if-else statements only.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("a is largest no.");
        } else if (b > a && b > c) {
            System.out.println("b is largest");
        } else if (c > a && c > b) {
            System.out.println("c is the largest");
        }
    }
}
