class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int result = 0;
        int temp  = x;
        while(x!=0){
            result = result*10 + x%10;
            x/=10;
        }
        return result==temp;
    }
}