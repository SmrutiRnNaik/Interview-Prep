class Solution {
    public int minBitFlips(int start, int goal) {
        // xor converts same bit to 0 and different bits to 1.
        // therefore the number of set bits in the resultant is the number of bits that needs to be flipped .
        int res = start ^ goal ;
        int count = 0;
        
        while(res>0){
            res&=res-1;
            count++;
        }
        return count;     
    }
}
