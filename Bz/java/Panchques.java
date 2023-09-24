import java.util.Scanner;

public class Panchques {
    public static void main(String[] args) {
        /*
         * 1-Write a program that asks the user for two numbers and then prints the sum,
         * difference, product, and quotient of the two numbers.
         * 2-Write 2-a program that asks the user for a number and then prints whether
         * the number is even or odd.
         * 3-Write a program that asks the user for a number and then prints the
         * factorial of the number.
         * 4-Write a program that asks the user for a number and then prints the square
         * root of the number.
         * 5-Write a program that asks the user for a number and then prints the first
         * 10 Fibonacci numbers.
         * 
         */

        // 2
        Scanner sc = new Scanner(System.in);
        // System.out.println("the number=");
        // int no = sc.nextInt();

        // if (no%2 == 0) {
        // System.out.println("no is even");
        // } else {
        // System.out.println("the no is odd");
        // }

        double no = sc.nextInt();
        double res = (Math.sqrt(no));
        System.out.println(res);

    }

}
