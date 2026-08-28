package Java.preparation;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        int count = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.get(c) == 1){
                // System.out.println(c + " is the first non repeating character.");
                // break;
                count++;
                if(count == 2){
                    System.out.println(c + " is the second non repeating character.");
                    break;
                }
            }
        }

        for(Map.Entry<Character, Integer> en : map.entrySet()){
            System.out.println("Key is : " + en.getKey() + " Value is : " + en.getValue());
        }
    }
}