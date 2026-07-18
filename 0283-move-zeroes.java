class Solution {
    public void moveZeroes(int[] nums) {
        /* initialise two pointers 
        l -> nums[0] and r -> 0 to n  
        if we come across non-zero ele , we swap it with  l pointer and increment l by 1 .
        */
        int l=0 , h=0 ;
        while(h < nums.length){
            if(nums[h] != 0){
                int temp = nums[h];
                nums[h] = nums[l];
                nums[l] = temp;
                l++;
            }
            h++;
        }
    }
}