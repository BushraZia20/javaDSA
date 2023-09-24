public class inerstion {
    public class Sort {
        public static void main(String[] args) {
            int[] arry = {5,2,9,1,5,6};
            insertionSort(arry);
            for(int num: arry){
                System.out.print(num + " ");
            }
        }
        public static void insertionSort(int[] chaya) {
            int n = chaya.length;
            for(int i =1;i<n;i++){
                int temp = chaya[i];
                int j =i-1;
                while(j>=0 && chaya[j] > temp) {
                    chaya[j+1] =chaya[j];
                    j--;
                }
                chaya[j+1] = temp;
            }
        }
    }
    
    
    
    /*
     *     {4,2,1,5,6,7}
     *      
     * 1st =   {2,4,1,5,6,7}
     * 
     * 2nd =   {2,1,4,5,6,7}
     * 
     * 3rd = {2,1,4,5,,6,7}
     * 
     * 4th ={1,2,4,5,6,7}
     */
}
