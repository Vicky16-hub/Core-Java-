package Practice;

import java.util.HashMap;

public class Pudhu_saval {
    public static void main(String[] args) {
        String s= "aaabbcccccccddabdd";
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        int count = 0;
        for( char c : s.toCharArray()){
            count++;

        }
        System.out.println(count);
    }
}
