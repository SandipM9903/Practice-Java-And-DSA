package Java.stream;
import java.util.*;
public class MultiplyEveryNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream().map(a-> a*2).forEach(a -> System.out.println(a));
    }
}
