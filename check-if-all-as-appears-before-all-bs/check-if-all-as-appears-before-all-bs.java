class Solution {
    public boolean checkString(String s) {
        int len = s.length();
        for(int i = 0;i<len - 1;i++){
            if(s.charAt(i) == 'b' && s.charAt(i+1) == 'a') return false; 
        }
        return true;
    }
}