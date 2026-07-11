class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int p1 = m-1 , p2 = n-1 , p3 =(m+n)-1;

        while(p1 >=0 && p2 >=0){
            if(nums2[p2] > nums1[p1]){
                nums1[p3--] = nums2[p2--]; // apna chutiya dimaag jyada mat lagana
            }
            else{
                nums1[p3--] = nums1[p1--];
            }
        } 
        while(p2 >= 0){ // iske liye gandu tu alag se kar raha tha , yaad rakhiyo
            nums1[p3--] = nums2[p2--];
        }
    }
}
