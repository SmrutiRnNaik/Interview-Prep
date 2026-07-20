class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();

        int l=0 , h = arr.length - 1 ;

        while(l<h){

            // now we will start another wile loop to find the first and last vowel

            while(l<h && !isVowel(arr[l])){
                l++;
            }

            while(l<h && !isVowel(arr[h])){
                h--;
            }

            if(l<h){
                char temp = arr[l] ;
                arr[l] = arr[h] ;
                arr[h] = temp ;
                l++;
                h--;
            }
        }

        return new String(arr);

    }
    static boolean isVowel(char c){
        if(c == 'a' || c == 'A'||
           c == 'e' || c == 'E'||
           c == 'i' || c == 'I'||
           c == 'o' || c == 'O'||
           c == 'u' || c == 'U'
        ){
            return true ;
        }
        return false ;
    }
}