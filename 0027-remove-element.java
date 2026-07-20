class Solution {
    public int removeElement(int[] nums, int val) {
        /* It's another two pointer question
        First initialize a pointer to zero
        and another pointer should traverse from 0 to n
        if the second pointer encounters ele which is not  j , swap with first pointer and increment it by 1
        return first pointer
        */

        int l = 0 ;

        for(int h=0;h<nums.length;h++){
            if(nums[h]!=val){
                int temp = nums[h];
                nums[h] = nums[l];
                nums[l] = temp ;
                l++;
            }
        }

        return l ;

        /**
        int l=0,h=0;
        while(h<nums.length){
            if(nums[h]!=nums[l]){
                swap(nums[h],nums[l]);
                l++;
            }
            h++;
        }
        return l ; 
        */
    }
}