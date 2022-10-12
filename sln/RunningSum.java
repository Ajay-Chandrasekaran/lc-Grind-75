// https://leetcode.com/problems/running-sum-of-1d-array/

package sln;

public class RunningSum {
    public static int[] Solve(int nums[]) {
        int len = nums.length;

        for (int i = 1; i < len; i++) {
            nums[i] = nums[i-1] + nums[i];
        }

        return nums;
    }
}
