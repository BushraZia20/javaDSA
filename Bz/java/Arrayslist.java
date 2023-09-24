import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Arrayslist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>(n);
            
            for (int i = 0; i < n;i++){
                int num = sc.nextInt();
                nums.add(num); 
               
            }
            Collections.sort(nums);
            int target = 2;
            Search(nums, target);
            }
        //     int count = -1;
        //     for(int i =0; i <nums.size(); i++){
        //         if(nums.get(i)==2){
        //             count = i;
        //             break;
        //         }
                
        //     }System.out.println(count);
          
        //    sc.close();
        
        
    
    public static void Search(ArrayList<Integer> nums, int target){
        boolean found = false;
        for(int i =0; i < nums.size(); i++){
            if(nums.get(i)==target){
                System.out.println(nums.get(i));
                found = true;
                break;
        }
       
    } if(found == false){
            System.out.println("-1");

        }
    }
}
