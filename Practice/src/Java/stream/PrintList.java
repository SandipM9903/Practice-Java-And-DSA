package Java.stream;
import java.util.*;

public class PrintList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,4,3);

        list.stream().forEach(a -> System.out.println(a));
    }    
}
