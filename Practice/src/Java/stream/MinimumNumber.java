package Java.stream;

import java.util.Arrays;
import java.util.List;

public class MinimumNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -10, -20, 0);

        int minimum = list.stream().min((a,b) -> a.compareTo(b)).get();
        System.out.println("Minimum Number : " + minimum);
    }
}
