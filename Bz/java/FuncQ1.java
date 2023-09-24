
    import java.util.Scanner;

public class FuncQ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array (N): ");
        int N = scanner.nextInt();

        int[] array = new int[N];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value (X): ");
        int X = scanner.nextInt();

        int countLessThanX = countElementsLessThanX(array, X);
        int countGreaterThanX = countElementsGreaterThanX(array, X);

        System.out.println("Total elements less than X: " + countLessThanX);
        System.out.println("Total elements greater than X: " + countGreaterThanX);

        scanner.close();
    }

    public static int countElementsLessThanX(int[] array, int X) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < X) {
                count++;
            }
        }
        return count;
    }

    public static int countElementsGreaterThanX(int[] array, int X) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > X) {
                count++;
            }
        }
        return count;
    }
}

    // public static int[] GetLess(int[] arr, int x) {
    //     int count = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] <= x) {
    //             count++;
    //         }
    //     }
        
    //     int[] result = new int[count];
    //     int j = 0;
    //     for (int i = 0; i < arr.length; i++) {
    //         if (arr[i] <= x) {
    //             result[j] = arr[i];
    //             j++;
    //         }
    //     }
        
    //     return result;
    // }

    // public static void main(String[] args) {
    //     int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
    //     int x = 2;
        
    //     int[] lessThanX = GetLess(arr, x);
    //     for (int i = 0; i < lessThanX.length; i++) {
    //         System.out.print(lessThanX[i] + " ");
    //     }
    // }

 
