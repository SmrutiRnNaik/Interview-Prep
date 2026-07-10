class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[] res = new int[2*n];

        for(int i=0;i<n;i++){
            res[i]=nums[i];
        }
        int idx = n-1;
        for(int i=n;i<2*n;i++){
            res[i]=nums[idx];
            idx--;
        }
    return res;
    }
}