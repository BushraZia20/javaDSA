import java.util.Scanner;

public class ThreeTopics {
    	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int x =sc.nextInt();
		
		String res = ThreeTopics(a,b,c,x);
		System.out.println(res);
		
	}
	public static String ThreeTopics(int a,int b,int c,int x){
	    if (a==x || b==x || c==x){
	        return "yes";
	    }else{
	        return "no";
	    }
	}
}
