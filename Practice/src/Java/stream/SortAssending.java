package Java.stream;

import java.util.Arrays;
import java.util.List;

public class SortAssending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 8, 1, 9, 2);

        list = list.stream()
                .sorted()
                .toList();

        System.out.println(list);
    }
}
