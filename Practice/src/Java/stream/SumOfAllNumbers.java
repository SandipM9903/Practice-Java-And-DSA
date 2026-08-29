package Java.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        int sum = list.stream().reduce((a,b) -> (a+b)).get();
        System.out.println("Sum of All the Numbers : " + sum);
    }
}
