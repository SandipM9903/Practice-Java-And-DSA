package Java.preparation;

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 1, 3, 4);
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : list) {
            System.out.println("Map is : " + map.get(num));

            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}
