class Solution {
    public int removeDuplicates(int[] nums) {
        /* This is an extension of question lc 27
        It's another two pointer question
        First initialize a pointer to zero
        and another pointer should traverse from 1 to n
        if the second pointer encounters ele which is not  nums[i] , swap with first pointer and increment it by 1
        return first pointer
        */

        int l = 0 ;

        for(int h=1;h<nums.length;h++){
            if(nums[h]!=nums[l]){
                l++;
                nums[l] = nums[h] ;
            }
        }
        return l+1 ;
    }
}