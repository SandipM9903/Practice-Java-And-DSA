package programs.array;
/*
Reverse Array
Given an integer array ( a ) of length ( n ), you want to create an array ( res ) of length ( 2n ) where ( res[i] = a[i] ) and ( res[i + n] = a[n - i - 1] ) for ( 0 <=i < n ) (0-indexed).

Hint: The ( res ) array is the concatenation of ( a ) and the reverse of ( a ).

Input Format:

The first line contains a single integer ( n ), representing the number of elements in the array.
The second line contains ( n ) space-separated integers representing the elements of the array.
Output Format:

Print the elements of the array ( res ).
Sample Input 1:

5
1 2 3 4 5
Sample Output 1:

1 2 3 4 5 5 4 3 2 1
Explanation:

The ( res ) array is formed by concatenating the array ( a ) with its reverse. Thus, ( res = [1, 2, 3, 4, 5, 5, 4, 3, 2, 1] ).

Constraints:

( 1 <= n <=1000 )
( -1000 <= a[i] <= 1000 )
Note:The function should return the result. The driver code will handle printing the output.
*/


public class ReverseArray1 {
    public int[] reverseArray(int n, int[] a) {
        int m = a.length;
        int[] res = new int[2 * m];

        for (int i = 0; i < m; i++) {
            res[i] = a[i];               // Copy normal order
            res[i + m] = a[m - 1 - i];   // Copy reversed order
        }
        return res;
    }
}
