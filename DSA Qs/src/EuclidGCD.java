/*
Leetcode 1979. Find Greatest Common Divisor of Array

Difficulty: Easy
Topic: Math

Time Complexity: O(log(min(a, b)))
Space Complexity: O(1)
*/

class Solution {
    public int findGCD(int[] nums) {

        // Works if constraints are not fixed 
        // int min = nums[0];
        // int max = nums[0];

        int min = 1001;
        int max = 0;

        for(int num : nums){
            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }

        return gcd(min, max);
    }

    // Recursive approach
    private int gcd(int a, int b){
        if(b == 0){
            return a;
        }

        return gcd(b, a%b);
    }

    // Iterative approach
    /*
    private int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    */
}