// import java.util.*;

// public class Main {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int sum = 0;
// 		int mean;

// 		int N = sc.nextInt();
// 		int[] arr= new int[N];
// 		for (int i = 0; i<N;i++){
// 			arr[i]= sc.nextInt();
// 		}

// 		for(int i = 0; i<N; i++){
// 			sum = sum + arr[i];
// 			System.out.println("sum="+sum);

// 		}
// 		mean = sum/N;
// 		System.out.println("mean = "+mean);
// 	}
// }

//Q1
// import java.util.*;

// public class Main {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int N = sc.nextInt();
// 		int T = sc.nextInt();
// 		int D = sc.nextInt();

// 		// int[] arr = new int[N];
// 		// for (int i = 0; i < N; i++){
// 		// 	arr[i] = sc.nextInt();
// 		// }

// 		for(int i = 1; i < T; i++){
// 			D = D+T-1;

// 		}
// 		System.out.println(D);
// 	}
// }

//Q2

// import java.util.*;
// public class Main{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int A = sc.nextInt();
// 		int B = sc.nextInt();

// 		int res = RotationPolicy(A, B);
// 		System.out.println("no. of days neither of them plays = "+ res);
// 	}
// 	public static int RotationPolicy(int A, int B){
// 		int count = 0;
// 		for(int i = A; i <= B; i++){
// 			if(i % 2 != 0 && i % 3 != 0){
// 				count ++;
// 			}
// 		}
// 		return count;
// 	}
// }

//Q5

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			
			int N = sc.nextInt();
			
			int X = sc.nextInt();
			int[] A = new int[N];
			
			for (int j = 0; j < A.length; j++) {
				A[j] = sc.nextInt();
			}
			int[] B = new int[N];
			
			for (int j = 0; j < B.length; j++) {
				B[j] = sc.nextInt();
			}
			RahulGroceries(N, X, A, B);
		}
	}

	public static void RahulGroceries(int N, int X, int[] A, int[] B) {
		int cost = 0;
		for (int j = 0; j < N; j++) {
			if (A[j] >= X) {
				cost = cost + B[j];
			}

		}
		System.out.println("the total cost of the items Rahul buys = " + cost);

	}
}