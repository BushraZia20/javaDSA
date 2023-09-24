import java.util.Arrays;

public class ArrAnaQ3 {
    // Given two strings s and t, return true if t is an anagram of s, and false
    // otherwise.
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if (s.length()!=  t.length()) {
            System.out.println("not ana");
            // return;

        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                System.out.println(" not ana");

            }
        }
       
           System.out.println(" ana");
            
    }

}