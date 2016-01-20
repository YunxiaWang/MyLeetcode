/*1. we only need to consider factors up to √n because, if n is divisible by some number p, 
then n = p × q and since p ≤ q, we could derive that p ≤ √n.
2.The Sieve of Eratosthenes is one of the most efficient ways to find all prime numbers up to n. 
start off with a table of n numbers. the first number 2, all multiples of 2 must not be primes, so we mark them off as non-primes.
Therefore, if the current number is p, we can always mark off multiples of p starting at p2, then in increments of p: p2 + p, p2 + 2p, ... 
3.The Sieve of Eratosthenes uses an extra O(n) memory and its runtime complexity is O(n log log n).  */
public class Solution {
    public int countPrimes(int n) {
      boolean[] isPrime = new boolean[n];
      for (int i = 2; i < n; i++) {
        isPrime[i] = true;
      }
   // Loop's ending condition is i * i < n instead of i < sqrt(n)
   // to avoid repeatedly calling an expensive function sqrt().
      for (int i = 2; i * i < n; i++) {
        if (!isPrime[i]) continue;
        for (int j = i * i; j < n; j += i) {
          isPrime[j] = false;
        }
      }
      int count = 0;
      for (int i = 2; i < n; i++) {
        if (isPrime[i]) count++;
      }
      return count;
    }
}
