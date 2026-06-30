Time Complexity: O(max bits) ≈ O(1)
Space Complexity: O(1)

Approach 1: XOR Rules

class Solution {
    public int minBitFlips(int start, int goal) {
        
        int xorRes = start ^ goal;
        int count = 0;

        while(xorRes != 0){
            count += xorRes & 1;
            xorRes >>= 1;
        }

        return count;
    }
}

Approach 2: Brian Kernighan’s Algorithm

class Solution {
    public int minBitFlips(int start, int goal) {
        
        int xorRes = start ^ goal;
        int count = 0;

        while(xorRes != 0){
            xorRes = xorRes & (xorRes-1);
            // xorRes &= (xorRes-1);
            count++;
        }

        return count;
    }
}
