package programs.array;

/*
Can you move two's?
Given an integer array nums, move all 2's to the end of it while maintaining the relative order of the non-zero elements. Note that you must do this in-place without making a copy of the array.

You don't need to return anything in the function, just perform in-place operations.

Input Format

The first line contains an integer ( n ), representing the number of elements in the array.
The second line contains ( n ) space-separated integers representing the elements of the array nums.
Output Format

Print the elements of the array after moving all 2's to the end.
Sample Input 1

3
2 2 1
Sample Output 1

1 2 2
Explanation For the given input, the array after moving all 2's to the end while maintaining the relative order of the non-zero elements is [1, 2, 2].

Constraints

( 1 <= arr.length<= 4 *10^4 )
( 0 <= arr[i] <= 10^9 )
Note: The function should perform in-place operations and not return anything. The driver code will handle printing the output.
*/

import java.util.List;

public class CanYouMoveTwo3 {
    public void moveTwos(List<Integer> nums) {
        int index = 0;

        for(int i=0; i<nums.size(); i++){
            if (nums.get(i) != 2){
                nums.set(index++, nums.get(i));
            }
        }
        while(index< nums.size()){
            nums.set(index++, 2);
        }
    }
}
