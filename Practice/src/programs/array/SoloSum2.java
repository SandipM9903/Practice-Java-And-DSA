package programs.array;

/*
Ramesh is working on a problem given by his teacher. He is given an array (nums ). He has to find such an array (ans ) such that (ans[i] =leftsum[i] +rightsum[i] ). Help Ramesh to solve the problem.

(leftsum[i] ) is the sum of all the elements to the left of index ( i ) in the array (nums ). If there is no such element, (leftsum[i] = 0 ).
(rightsum[i] ) is the sum of all the elements to the right of index ( i ) in the array (nums ). If there is no such element, (rightsum[i] = 0 ).
Input Format:

The first line contains an integer ( n ), representing the number of elements in the array.
The second line contains ( n ) space-separated integers representing the elements of the array (nums ).
Output Format:

Print the elements of the array (ans ).
Sample Input 1:

5
1 2 3 4 5
Sample Output 1:

14 13 12 11 10
Explanation:

For the first sample input:

(leftsum[0] = 0 ), (rightsum[0] = 14 ) (sum of elements to the right of index 0).
(leftsum[1] = 1 ), (rightsum[1] = 12 ) (sum of elements to the right of index 1).
(leftsum[2] = 3 ), (rightsum[2] = 9 ) (sum of elements to the right of index 2).
(leftsum[3] = 6 ), (rightsum[3] = 5 ) (sum of elements to the right of index 3).
(leftsum[4] = 10 ), (rightsum[4] = 0 ) (no elements to the right of index 4).
Thus, (ans = [14, 13, 12, 11, 10] ).

Sample Input 2:

5
1 2 -3 4 -5
Sample Output 2:

-2 -3 2 -5 4
Explanation:

For the second sample input:

(leftsum[0] = 0 ), (rightsum[0] = -2 ) (sum of elements to the right of index 0).
(leftsum[1] = 1 ), (rightsum[1] = -4 ) (sum of elements to the right of index 1).
(leftsum[2] = 3 ), (rightsum[2] = -1 ) (sum of elements to the right of index 2).
(leftsum[3] = 0 ), (rightsum[3] = -5 ) (sum of elements to the right of index 3).
(leftsum[4] = 4 ), (rightsum[4] = 0 ) (no elements to the right of index 4).
Thus, (ans = [-2, -3, 2, -5, 4] ).

Constraints:

( 1 <=nums.length <= 1000 )
( -10000 <=nums[i] <= 10000 )
Note:The function should return the result. The driver code will handle printing the output.
*/

public class SoloSum2 {
    public static int[] leftRightSum(int[] nums) {
        int l = nums.length;
        int[] a = new int[l];
        int totalSum = 0;

        for (int num : nums){
            totalSum += num;
        }

        for (int i=0; i<l; i++){
            a[i] = totalSum - nums[i];
        }
        return a;
    }
}
