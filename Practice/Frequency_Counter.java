package Practice;

import java.util.HashMap;
import java.util.Map;

public class Frequency_Counter {
    public static void main(String[] args) {
        String s="aabbbbbbcddqqqq";
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        for(char c :s.toCharArray()){
            h.put(c,h.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer>entry :h.entrySet()){
            System.out.println(entry);
        }

    }
}
