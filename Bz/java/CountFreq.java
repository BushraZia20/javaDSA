import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class CountFreq {
    public static void main(String[] args) {
       ArrayList<Character> char1 = new ArrayList<>();
       insert(char1, 'i');
       insert(char1, 'n');
       insert(char1, 'i');
       insert(char1, 'e');
       insert(char1, 'i');
       insert(char1, 'w');
       insert(char1, 'i');
       insert(char1, 't');
       insert(char1, 'i');
       insert(char1, 'n');
       insert(char1, 'f');
       find(char1, 'n');
        ArrayList<Character> char2 = new ArrayList<>();
        insert(char2, 'i');
        insert(char2, 'c');
        insert(char2, 'i');
        insert(char2, 'p');
        insert(char2, 'i');
        insert(char2, 'p');
        
        find(char2, 'f');

    }

    private static void insert(ArrayList<Character> alphabets, char c) {
        alphabets.add(c);
    }
    public static void find(ArrayList<Character> alphabets, char c){
        if(alphabets.contains(c)){
            System.out.println(Collections.frequency(alphabets, c));
        }else{
            System.out.println("not present");
        }
    }
}
