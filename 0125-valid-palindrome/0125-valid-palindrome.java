class Solution {
    public boolean isPalnindrome(String s){
        int low = 0;
        int high = s.length()-1;
        while(low<high){
            if(s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<s.length();i++){
            int code = Character.toLowerCase(s.charAt(i));
            if((code>96 && code <123) || (code >47 & code<58)){
                sb.append((char) code);
            }
        }
        s = sb.toString();
        return isPalnindrome(s);
    }
}