/*
LeetCode 9 - Palindrome Number

Difficulty: Easy
Topic: Math

Time Complexity: O(log₁₀ n)
Space Complexity: O(1)

1) Reverse only half the digits so that there is no integer overflow
2) For odd-length numbers, the middle digit doesnt matter
*/

class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reversed = 0;

        while(x > reversed){
            int digit = x % 10;
            reversed = reversed*10 + digit;
            x /= 10;
        }

        return x == reversed || x == reversed/10;
    }
}
