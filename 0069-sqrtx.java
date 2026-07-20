class Solution {
    public int mySqrt(int x) {
        
        if(1 == x)
            return x ;
        int r = x/2 ;
        int l = 1 ;

        while(l<=r){
            int m = l + (r-l)/2 ;

            long sq = (long)m * m ;

            if(sq == x){
                return  m ;
            }else if(sq > x){
                r = m-1;
            }else{
                l = m+1;
            }
        }
        return r ;
    }
}