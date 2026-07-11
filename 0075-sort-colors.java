class Solution {
    public void sortColors(int[] nums) {
        int l = 0 , mid = 0 , h = nums.length - 1 ;
        while(mid<=h){
            if(nums[mid]==0){
                swap(l,mid,nums);
                l++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(mid,h,nums);
                h--;
            }
        }

    }
    public void swap(int l , int h , int[] nums){
        int temp = nums[l];
        nums[l] = nums[h];
        nums[h] = temp ;
    }
}