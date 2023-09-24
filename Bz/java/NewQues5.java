import java.util.*;
public class NewQues5 {
    /*
     Check whether the triangle is equilateral, scalene, or isosceles

Before writing the program, we should know the properties of isosceles, equilateral, and scalene triangles.

Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length.


Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal.

Scalene triangle: A scalene triangle is a triangle that has three unequal sides.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
         
        if (A == B && A != C) {
            System.out.println("it is a isosceles tri");
        } else if (A == B && A== C) {
            System.out.println("it is equilateral tri");
        } else {
            System.out.println("it is scalene tri");
        }
         
    }
}



