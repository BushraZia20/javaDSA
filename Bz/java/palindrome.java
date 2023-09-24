public class palindrome {
   public static void main(String[] args) {
   
       
            int number = 12321; // Change the number to test for different values
            
            int ogNum = number;
            int revNumber = 0;
            
            
            for (int temp = number; temp != 0; temp /= 10) {
                int digit = temp % 10;
                revNumber = revNumber * 10 + digit;
            }
            
            if (ogNum == revNumber) {
                System.out.println(ogNum + " is a palindrome.");
   } 
}
}