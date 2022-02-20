/*
Given an array intervals where intervals[i] = [li, ri] represent the interval [li, ri), remove all intervals that are covered by another interval in the list.

The interval [a, b) is covered by the interval [c, d) if and only if c <= a and b <= d.

Return the number of remaining intervals.

 

Example 1:

Input: intervals = [[1,4],[3,6],[2,8]]
Output: 2
Explanation: Interval [3,6] is covered by [2,8], therefore it is removed.
Example 2:

Input: intervals = [[1,4],[2,3]]
Output: 1
 

Constraints:

1 <= intervals.length <= 1000
intervals[i].length == 2
0 <= li <= ri <= 105
*/
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> (Integer.compare(a[0], b[0])));
        int left = -1;
        int right = -1;
        int count  = 0;
        for (int[] inter : intervals) {
            if (inter[0] > left && inter[1] > right) {
                left = inter[0];
                count += 1;
            }
            right = Math.max(right, inter[1]);
        }
        return count;
        
    }
}
