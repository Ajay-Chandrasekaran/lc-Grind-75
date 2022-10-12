// https://leetcode.com/problems/longest-palindrome/
package sln;

import java.util.HashMap;

public class LongestPaliandrome {
    public static int Solve(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.compute(c, (k, v) -> (v==null)? 1: v+1);
        }

        int plus = 0;
        int length = 0;
        for(Integer val: map.values()) {
            if (val == 1) {
                plus = 1;
            } else if (val % 2 == 0) {
                length = length + val;
            } else {
                length = length + (val - 1);
            }
        }
        return length + plus;
    }
}
