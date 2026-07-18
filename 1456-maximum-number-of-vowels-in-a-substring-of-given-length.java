class Solution {
    public int maxVowels(String s, int k) {
        int c = 0 ;
        int n = s.length();

        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
        }
        int max = c , idx = 0 ;

        while(k<n){
            
            if(isVowel(s.charAt(k))){
                c++;
            }
            if(isVowel(s.charAt(idx))){
                c--;
            }

            if(c > max)
                max = c ;

            idx++;
            k++;
        }

        return max ;

        
    }

    static boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u')
            return true;
        
        return false;
    }
}