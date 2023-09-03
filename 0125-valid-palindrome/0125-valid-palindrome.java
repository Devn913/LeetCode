class Solution {
    public boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while(low<high){
            int code1 = Character.toLowerCase(s.charAt(low));
            if(!((code1>96 && code1 <123) || (code1 >47 && code1<58))){
                low++;
                continue;
            }
            int code2 = Character.toLowerCase(s.charAt(high));
            if(!((code2>96 && code2<123) || (code2 >47 && code2<58))){
                high--;
                continue;
            }
            if(code1!=code2) return false;
            low++;
            high--;
        }
        return true;
    }
}