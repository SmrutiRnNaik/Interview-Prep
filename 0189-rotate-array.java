class Solution {
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        swap(0,nums.length - 1,nums);
        swap(0,k-1,nums);
        swap(k,nums.length - 1,nums);
    }
    public void swap(int i , int j , int[] nums){
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp ;
            i++;
            j--;
        }
    }
}