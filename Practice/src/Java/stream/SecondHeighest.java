package Java.stream;

import java.util.Arrays;
import java.util.List;

public class SecondHeighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 8, 1, 9, 2);

        int result = list.stream()
                        .sorted()
                        .distinct()
                        .skip(list.size() - 2)
                        .findFirst()
                        .get();

        System.out.println(result);
    }
}
