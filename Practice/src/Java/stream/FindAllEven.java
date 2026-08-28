package Java.stream;

import java.util.*;

public class FindAllEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,4,3,8,6);

        list.stream().filter(a-> a%2 == 0)
        .forEach(a->System.out.println(a));
    }
}