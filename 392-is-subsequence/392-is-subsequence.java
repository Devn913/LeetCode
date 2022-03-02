class Solution {
    public boolean isSubsequence(String s, String t) {
        int start = 0;
        for(int i = 0;i<s.length();i++){
            boolean found = false;
            while(start<t.length()){
                if(s.charAt(i) == t.charAt(start)){
                    found = true;
                    start++;
                    break;
                }
                start++;
            }
            if(!found) return false;
        }
        return true;
    }
}