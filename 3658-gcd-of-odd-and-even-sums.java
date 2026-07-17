class Solution {
    public int gcdOfOddEvenSums(int n) {
        /* 
        sumOdd = n^2 => n*n;
        sumEven = n(n+1)  ;
        So the gcd of (n*n , n*n+1) = > n* gcd(n,n+1)
        gcd(n,n+1) => 1;
        n* gcd(n,n+1) => n;
        */
        return n;
    }
}