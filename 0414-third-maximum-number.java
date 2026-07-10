class Solution {
    public int thirdMax(int[] nums) {
        long large = Long.MIN_VALUE;
        long secondLarge = Long.MIN_VALUE;
        long thirdLarge = Long.MIN_VALUE;


        for(int num : nums){
            
            if (num == large || num == secondLarge || num == thirdLarge)
                continue; // this line is for duplication handling as the problem statement is to find the distinct elements
            
            if(num > large) {
                thirdLarge = secondLarge ;
                secondLarge = large ;
                large = num ;
            }else if(num > secondLarge){
                thirdLarge = secondLarge ;
                secondLarge = num ;
            } else if(num > thirdLarge){
                thirdLarge = num ;
            }
        }

        return thirdLarge == Long.MIN_VALUE ? (int)large : (int)thirdLarge;
    }
}