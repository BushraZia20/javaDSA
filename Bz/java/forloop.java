import java.util.*;
class forloop {
    public static void main(String[] args) {
    //   Write a for loop that iterates over a list of numbers and prints only the numbers that are divisible by 3.
    // Scanner sc = new Scanner(System.in);
    //      int n = sc.nextInt();
    // for (int i = 1; i<=n; i++){
    //     if (i % 3 == 0) {
    //      System.out.print(i + " ");     
    //     }

    // 
    //     Scanner sc = new Scanner(System.in);
    // String s = sc.nextLine();
    // for (int i = 0; i < s.length(); i++){
    //     System.out.println(s.charAt(i) + "-" + i);
    //  }
    // }
    	Scanner sc = new Scanner(System.in);
		     int t = sc.nextInt();
		for (int i = 1; i<=t; i++){
		     int x = sc.nextInt();
		     int y = sc.nextInt();
		if (x>y || x==y){
		    System.out.println("yes");
		} else {
		    System.out.println("no");
		}
		} 
	}
}

 
