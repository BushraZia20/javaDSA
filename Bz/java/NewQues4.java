import java.util.Scanner;

public class NewQues4 {
  /*
   * program to find out whether a given year is a leap year or not
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();

    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
      System.out.println("it is a leap yr");
    } else {
      System.out.println("it is not LY");
    }
  }
}
