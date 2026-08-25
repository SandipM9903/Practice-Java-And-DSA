package Java.preparation;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 3, 3, 3);
        Set<Integer> set = list.stream().collect(Collectors.toSet());

        System.out.println(set);
    }
}
