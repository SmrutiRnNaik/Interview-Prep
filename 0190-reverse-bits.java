class Solution {
    public int reverseBits(int n) {
        int x = 0 ;
        for(int i=0;i<32;i++){
            x<<=1;           // left shift the last bit => makes space for the new bit
            x = x | (n & 1); // adds nth bit to the x 
            n>>=1;           // right shift n bit => removes the recently added bit
        }
        return x ;
    }
}