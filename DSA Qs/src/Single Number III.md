Q. 
Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

A.
Time Complexity - O(n)
Space Complexity - O(1)

class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;

        for(int num : nums){
            xor ^= num;
        }

        // Rightmost set bit
        int rightMostBit = xor & (-xor);

        int a = 0;
        int b = 0;

        for(int num : nums){
            if((num & rightMostBit) == 0){
                a ^= num;
            } else {
                b ^= num;
            }
        }

        return new int[]{a, b};
    }
}

