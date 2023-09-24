public class ArrQ6 {
    public static void main(String[] args) {
        int[] arr = { 15, 2, 45, 3, 5 };
        int n = arr.length;
        // int[] temp = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == i + 1) {
                // temp[count++]=i+1;
                if(count>0){
                    System.out.print(",");
                    
                }
            System.out.print(arr[i]);
            count++;
            }
           
        }
    } 

}