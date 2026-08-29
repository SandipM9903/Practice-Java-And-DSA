package Java.preparation;

import java.util.Arrays;
import java.util.*;

public class RemoveDuplicatesSecond {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 4);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int nums : list) {
            if (map.containsKey(nums)) {
                map.put(nums, map.get(nums) + 1);
            } else {
                map.put(nums, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "-> " + entry.getValue());
            }
        }
        System.out.println("==============================");
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(entry.getKey());
        }
        System.out.print(result + " ");
    }
}
