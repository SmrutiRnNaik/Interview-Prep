class Solution {

    // this is an nlog n solution 
    // there is o(n) dp solution
    // i want you to revisit later
    public int[] countBits(int n) {
        int[] arr = new int [n+1];
        arr[0]=0;

        for(int i=1;i<n+1;i++){
            arr[i] = cntSetBit(i);
        }

        return arr ;
    }

    static int cntSetBit(int n){
        int c = 0 ;
        while(n>0){
            n&=(n-1);
            c++;
        }
        return c ;
    }
}