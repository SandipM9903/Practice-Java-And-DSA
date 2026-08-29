package Java.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDecending {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 8, 1, 9, 2);

        list = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(list);
    }
}
