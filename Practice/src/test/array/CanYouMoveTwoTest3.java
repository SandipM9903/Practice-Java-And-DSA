package test.array;

import org.junit.jupiter.api.Test;
import programs.array.CanYouMoveTwo3;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CanYouMoveTwoTest3 {
    CanYouMoveTwo3 solution = new CanYouMoveTwo3();

    @Test
    void testSampleInput1() {
        List<Integer> input = Arrays.asList(2, 2, 1);
        List<Integer> expected = Arrays.asList(1, 2, 2);
        solution.moveTwos(input);
        assertEquals(expected, input);
    }

    @Test
    void testNoTwos() {
        List<Integer> input = Arrays.asList(1, 3, 4);
        List<Integer> expected = Arrays.asList(1, 3, 4);
        solution.moveTwos(input);
        assertEquals(expected, input);
    }

    @Test
    void testAllTwos() {
        List<Integer> input = Arrays.asList(2, 2, 2);
        List<Integer> expected = Arrays.asList(2, 2, 2);
        solution.moveTwos(input);
        assertEquals(expected, input);
    }

    @Test
    void testTwosInBetween() {
        List<Integer> input = Arrays.asList(4, 2, 5, 2, 3, 2);
        List<Integer> expected = Arrays.asList(4, 5, 3, 2, 2, 2);
        solution.moveTwos(input);
        assertEquals(expected, input);
    }

    @Test
    void testSingleElementTwo() {
        List<Integer> input = Arrays.asList(2);
        List<Integer> expected = Arrays.asList(2);
        solution.moveTwos(input);
        assertEquals(expected, input);
    }

    @Test
    void testSingleElementNonTwo() {
        List<Integer> input = Arrays.asList(9);
        List<Integer> expected = Arrays.asList(9);
        solution.moveTwos(input);
        assertEquals(expected, input);
    }

    @Test
    void testEmptyList() {
        List<Integer> input = Arrays.asList();
        List<Integer> expected = Arrays.asList();
        solution.moveTwos(input);
        assertEquals(expected, input);
    }
}
