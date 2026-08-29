package Java.stream;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,1,3,4,5);

        list = list.stream()
        .distinct()
        .toList();

System.out.println(list);
    }
}
