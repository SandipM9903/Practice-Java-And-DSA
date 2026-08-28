package Java.stream;
import java.util.*;

public class FindAllOdd {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

        list.stream().filter(a-> a%2!= 0).forEach(a -> System.out.println(a));
    }
}
