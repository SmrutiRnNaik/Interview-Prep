class Solution {
    public double myPow(double x, int n) {
        // the method i used works best for long so we are convering int n to long N
        long N = n;
        // handling edge cases
        // n can be negative when negative x becomes 1/x so n can become +ve
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        // this is the best method for power calculation
        if(N==0)
            return 1 ;
        
        double mid = myPow(x,(int)(N/2));
        if(N%2 == 0 ){
            return (mid * mid) ;
        }else{
            return (x*mid*mid);
        }
    }
}