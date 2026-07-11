class Solution {
    public int hammingDistance(int x, int y) {
        /* this is the same as flip bits question
        we will xor both the integers and count no of set bits 
        xor converts same bit to 0 and different bits to 1.
        therefore the number of set bits in the resultant is the number of bits that needs to be flipped 
        */

        int res = x ^ y ;
        int count = 0;

        while(res>0){
            res&=(res-1);
            count++;
        }
        return count;
    }
}