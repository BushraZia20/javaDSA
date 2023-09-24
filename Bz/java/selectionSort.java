public class selectionSort {
    public static void main(String[] args) {
        int arr[] = { 2,1,0,2,2,0,1,0,0,1 };

        SelectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SelectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElementIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minElementIndex] > arr[j]) {
                    minElementIndex = j;
                   

                }

            } 
            if (minElementIndex != i) {
                        int temp = arr[i];
                        arr[i] = arr[minElementIndex];
                        arr[minElementIndex] = temp;
                    }

        }
    }
}
