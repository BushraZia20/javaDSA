import java.util.*;

public class NewQues {
     /* You are designing a program that determines the eligibility of students for a
     * scholarship based on their academic performance. The scholarship is awarded
     * to students who meet the following criteria:
     * 
     * The student must have a GPA (Grade Point Average) of 3.5 or above.
     * The student must have completed at least 50 credit hours.
     * The student must not have any academic dishonesty violations.
     * Write a program that takes the student's GPA, completed credit hours, and
     * academic dishonesty status as input, and outputs whether the student is
     * eligible for the scholarship or not.
     * 
     * You can use the following variables:
     * 
     * gpa: A float representing the student's GPA.
     * credit_hours: An integer representing the number of completed credit hours.
     * academic_dishonesty: A boolean (True or False) indicating whether the student
     * has any academic dishonesty violations.
     * Your task is to write the if and else statements to check the eligibility
     * criteria and output the appropriate message.
     * 
     * Note: This problem assumes that the input values are valid and within the
     * appropriate range.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float gpa = sc.nextFloat();
        int cr_hrs = sc.nextInt();
        boolean academic_dishonesty = sc.nextBoolean();

        if (gpa >= 3.5 && cr_hrs >= 50 && !academic_dishonesty) {
            System.out.println("the student is eligible");
        } else {
            System.out.println("the student is not eligible");
        }
    }
}
