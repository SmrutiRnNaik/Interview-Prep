class Solution {
    public int[] productExceptSelf(int[] nums) {
        // first create a prefix array
        int n = nums.length ;
        int[] pre = new int[n];
        int prefix = 1 ;
        for(int i=0;i<n;i++){
            pre[i] = prefix ; // (or) we can also write pre[i] = pre[i-1]*nums[i-1] after initialising pre[0]  to 1
            prefix *= nums[i] ;
        }
        // now create a suffix variable and traverse from left to right
        int suffix = 1 ;

        for(int i=n-1; i>=0;i--){
            pre[i]*=suffix;
            suffix*=nums[i];
        }

        return pre ;
    }
}