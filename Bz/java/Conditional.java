 import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        // int bushra = 7;

        //     if(bushra>18) {
        //         System.out.println("isAdult");
        //     }else{
        //         System.out.println("notAdult");
        //     }
            
            //if-selse
            //if else(if then else)
            //if
            /*
            if percentage is above 90,assign grade A,
             if the percentage is above 75 assign grade b,
             if the percentage is above 65  assign grade c,
             otherwise print fail.
            */
            Scanner sc = new Scanner(System.in);
            System.out.println("Total mark");
            int mark = sc.nextInt();
            if(mark>90){
                System.out.println("A");
            }else if(mark >=75){
                System.out.println("b");
            }else if(mark >=65){
                System.out.println("c");
            }else{
                System.out.println("fail");
            }
                
    }
}

