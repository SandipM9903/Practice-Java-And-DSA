package test;

import org.junit.jupiter.api.Test;
import programs.ReverseArray1;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest1 {

    ReverseArray1 reverseArray1 = new ReverseArray1();

    @Test
    void testSampleInput1() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        assertArrayEquals(expected, reverseArray1.reverseArray(5, input));
    }

    @Test
    void testSingleElementArray() {
        int[] input = {42};
        int[] expected = {42, 42};
        assertArrayEquals(expected, reverseArray1.reverseArray(1, input));
    }

    @Test
    void testNegativeNumbers() {
        int[] input = {-1, -2, -3};
        int[] expected = {-1, -2, -3, -3, -2, -1};
        assertArrayEquals(expected, reverseArray1.reverseArray(3, input));
    }

    @Test
    void testAllZeros() {
        int[] input = {0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0, 0};
        assertArrayEquals(expected, reverseArray1.reverseArray(3, input));
    }

    @Test
    void testMixedPositiveNegative() {
        int[] input = {-5, 0, 5};
        int[] expected = {-5, 0, 5, 5, 0, -5};
        assertArrayEquals(expected, reverseArray1.reverseArray(3, input));
    }
}

