class Solution {
    public boolean judgeSquareSum(int c) {
        long h = (long) Math.sqrt(c);
        long l = 0 ;

        while(l<=h){
            long ans = l*l + h*h;

            if(ans == c){
                return true;
            }else if(ans > c){
                h--;
            }else{
                l++;
            }
        }
        return false;
    }
}