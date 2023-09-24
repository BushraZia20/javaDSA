import java.util.*;
public class NewQ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 12 == 0) {
            System.out.println("the no. is div by 4&3");
        } else {
            System.out.println("the no. isn't div bt 4&3");
        }
    }
}
