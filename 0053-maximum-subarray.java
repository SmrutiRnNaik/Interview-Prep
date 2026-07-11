class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = Integer.MIN_VALUE , max = Integer.MIN_VALUE ;

        for(int i=0;i<nums.length;i++){

            if(currSum < 0)
                currSum = 0 ;
            
            currSum += nums[i];
            max = Math.max(currSum,max);
        }

        return max ; 
    }
}