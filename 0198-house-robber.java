class Solution {
    public int rob(int[] nums) {
        int n = nums.length ;
        if(1==n)
            return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        // we will only store the max money that the robber can rob in a night
        dp[1] = Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            // i was only storing nums[i]+dp[i-2] but we need to store max value in dp
            // remember your mistakes
            dp[i]=Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[n-1];
    }
}