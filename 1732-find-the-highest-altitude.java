class Solution {
    public int largestAltitude(int[] gain) {
        int[] ps = new int[gain.length + 1];
        ps[0]=0;
        int max = 0 ;

        for(int i=1;i<ps.length;i++){
            ps[i]=gain[i-1]+ps[i-1];
            max = Math.max(max,ps[i]);
        }
        return max ;
    }
}