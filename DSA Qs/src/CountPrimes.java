/*
LeetCode 204 - Count Primes

Difficulty: Medium
Topic: Math

Time Complexity: O(nlog logn)
Space Complexity: O(n)

1) First step - mark 0 and 1 as false because they are not prime
2) Take a boolean array and mark all numbers as prime
3) Inner loop starts from i*i because all smaller multiples (2i, 3i,.. (i-1)*i) have already been marked
4) Use j+=i to visit only multiples of i.
*/

class Solution {
    public int countPrimes(int n) {
        if(n <= 2){
            return 0;
        }

        boolean[] isPrime = new boolean[n];

        for(int i=2; i<n; i++){
            isPrime[i] = true;
        }

        for(int i=2; i*i<n; i++){
            if(isPrime[i]){
                for(int j=i*i; j<n; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for(int i=2; i<n; i++){
            if(isPrime[i]){
                count++;
            }
        }

        return count;
    }
}