import java.util.*;
public class AssignOp {
    /*
     add 5 and 4
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int year = sc.nextInt();

       LeapYear(year);
    }
    static void LeapYear(int year){
if((year %4 ==0 && year%100 !=0) || (year %400==0)){
    System.out.println("it is leap year");
}else{
    System.out.println("it is not leap year");
}
    }
}