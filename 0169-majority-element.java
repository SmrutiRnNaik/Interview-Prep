class Solution {
    public int majorityElement(int[] nums) {
        int ele = nums[0];
        int count = 1 ;

        for(int i=1 ; i<nums.length;i++){
            
            if(0 == count){
                ele = nums[i];
            }

            if(nums[i] == ele){
                count++;
            }else{
                count--;
            }
        }

        return ele ;
    }
}