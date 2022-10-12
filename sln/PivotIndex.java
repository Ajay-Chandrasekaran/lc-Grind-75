// https://leetcode.com/problems/find-pivot-index/

package sln;

public class PivotIndex {
    public static int Solve(int nums[]) {
        int len = nums.length+2;
        int[] rsum = new int[len];

        rsum[0] = 0;
        rsum[len-1] = 0;
        for (int i=0; i<len-2; i++) {
            rsum[i+1] = rsum[i] + nums[i];
        }

        for (int j=0; j<len-2; j++) {
            if ((rsum[len-2] - rsum[j+1]) == (rsum[j+1] - nums[j])) {
                return j;
            }
        }
        return -1;
    }
}
