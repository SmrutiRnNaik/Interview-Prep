class Solution {
    public int maxProduct(int[] nums) {
        int currPro = 1 ;
        int max = Integer.MIN_VALUE;

        // Kadane's Algorithm .
        // You have already solved maximum sum array(LC 53) using the same code .
        // Bkl bhulna mat
        // So i have come to realisation that i am a chutiya and it isnt kadanes ; its dp(the solution will be commented on latter half).
        // first we traverse from l->r and then we reset the currPro value and again traverse in opposite direction

        for(int i=0 ; i< nums.length ; i++){
            if( currPro == 0){
                currPro = 1 ;
            }
            currPro *= nums[i];
            max = Math.max(currPro , max);
        }

        currPro = 1 ;

        for(int i=nums.length-1;i>=0;i--){
            currPro *=nums[i];
            max = Math.max(currPro,max);
            if( currPro == 0){
                currPro = 1 ;
            }
        }
        return max;
    }
}


/*  DP SOLUTION

class Solution {
    public int maxProduct(int[] nums) {
        

        //1. Maintain max as well as min product 


        int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // 2. if you ever encounter a -ve value swap max and min product
            
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }

            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            ans = Math.max(ans, maxProd);
        }

        return ans;
    }
}

 */