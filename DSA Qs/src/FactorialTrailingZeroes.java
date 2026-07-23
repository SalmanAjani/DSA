/*
LeetCode 172 - Factorial Trailing Zeroes

Difficulty: Medium
Topic: Math

Time Complexity: O(log₅n)
Space Complexity: O(1)
*/

class Solution {
    public int trailingZeroes(int n) {
        int res = 0;

        for(int i=5; i<=n; i=i*5){
            res += n/i;
        }

        return res;
    }
}