class Solution {
    public int maxOperations(int[] nums, int k) {
        int c = 0 ;

        /**
        This is an O(NlogN) solution , you can also use hashmap => if using hashmap decrement the key value everytime we hit the target to do it in O(N) tc 

        Update : HashSet solution fails  [2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2] k=3 testcase
        so we need to use hashmap for frequency storing
        */

        Arrays.sort(nums);
        int l = 0 , h = nums.length-1;
        while(l<h){
            if(nums[l]+nums[h] == k){
                c++;
                l++;
                h--;
            }else if(nums[h] + nums[l] > k){
                h--;
            }else{
                l++;
            }   
        }

        /**
        Set<Integer> set = new HashSet<>();
        for(int i=0 ;i<nums.length ;i++){
            int target = k - nums[i];

            if(set.contains(target)){
                c++;
                set.remove(target);
            }else{
                set.add(nums[i]);
            }
        } 
         */
        return c ;
    }
}