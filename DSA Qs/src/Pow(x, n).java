/*
Leetcode 50. Pow(x, n)

Difficulty: Medium
Topic: Math, Recursion

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public double myPow(double x, int n) {

        long N = n; // Convert to long to handle edge case of n = -2147483648 (Integer.MIN_VALUE)
        
        if(N < 0){
            x = 1/x;
            N = -N;
        }

        double res = 1;

        while(N > 0){

            if((N & 1) != 0){ // same as n % 2 != 0
                res *= x;
            }

            x *= x;
            N >>= 1; // same as n divided by 2
        }

        return res;
    }
}
