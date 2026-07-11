class Solution {
    public String reverseWords(String s) {
        // String[] arr = s.split(" ");
        String[] arr = s.trim().split("\\s+"); // \\s+ removes one or more whitespace charcters
        StringBuilder str = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){

            str.append(arr[i]);
            
            if(i!=0)
                str.append(" ");

        }
        return str.toString();
    }
}
/*

        String str="";
        for(int i=arr.length-1;i>=0;i--){

            str+= arr[i]; -> this line creates a new string everytime which increases the complexity to n2 .So we are gonna use StringBuilder
            
            if(i!=0)
                str+=" ";

        }

        */
