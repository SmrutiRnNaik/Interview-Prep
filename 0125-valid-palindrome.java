class Solution {
    public boolean isPalindrome(String s) {
        // the line below removes all special characters and converts every other character to lower case  
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l=0 , h=s.length()-1;

        while(l<=h){
            if(s.charAt(l)==s.charAt(h)){
                l++;
                h--;
            }else
                return false;
        }
        return true;
    }
}