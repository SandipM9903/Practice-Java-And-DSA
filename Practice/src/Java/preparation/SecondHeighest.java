package Java.preparation;

import java.util.Arrays;
import java.util.List;

public class SecondHeighest {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 2);
        int heighest = Integer.MIN_VALUE;
        int secondHeighest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > heighest) {
                secondHeighest = heighest;
                heighest = num;
            } else if (num > secondHeighest && num != heighest) {
                secondHeighest = num;
            }
        }
        System.out.println("Second Heighest : " + secondHeighest + " Heighest : " + heighest);
    }
}
