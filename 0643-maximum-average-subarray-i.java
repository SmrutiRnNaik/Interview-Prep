class Solution {
    public double findMaxAverage(int[] nums, int k) {
        /* Instead of finding max avg in every window we can just find max sum and compute avg at last */
        int sum = 0 , size = k ;
        // first window
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }

        int max = sum ;

        // now slide that window
        int idx = 0 ;
        while(k<nums.length){
            
            sum += nums[k];
            sum -= nums[idx];
            
            if(max < sum)   max = sum ;

            idx++;
            k++;
        }
        // we are modifying k so we had to store k value in another variable
        return (double) max / size ;

    }
}