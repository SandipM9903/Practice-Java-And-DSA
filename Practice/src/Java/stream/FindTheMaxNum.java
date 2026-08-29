package Java.stream;

import java.util.Arrays;
import java.util.List;

public class FindTheMaxNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 10, 15, 6, 7, 8, 9);

        Integer max = list.stream().max((a,b) -> a.compareTo(b)).get();
        System.out.println("Max is : " + max);
    }
}
