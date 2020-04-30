package numbertheory;

import java.util.List;

/**
 *
 * algorithm for finding all the prime numbers in a segment [1;n] using O(nloglogn) operations.
 *
 */
public class SieveofEratosthenes {

    /**
     * The runtime of this approach is O(n log logn).
     *
     */
    public void findPrime(int n){

        boolean[] isPrime = new boolean[n+1];

        for(int i=2; i<isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i] && (long)i * i <= n) {
                for (int j = i * i; j <= n; j += i)
                    isPrime[j] = false;
            }
        }

    }

    public static void main(String arg[]){

    }
}
